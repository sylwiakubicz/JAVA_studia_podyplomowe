package interfejsy;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class DataProvidersApp {
    public static void main(String[] args) {
        // SimpleDataProvide dataProvider = new SimpleDataProvide();
        DataProvider dataProvider = new SimpleDataProvide(); // dajemy typ interfejs i wtedy możemy pisać bardziej ogółnie metody na dole
        DataProvider dataProvider2 = new FileDataProvider();
        DataPresenter.showData(dataProvider);
        DataPresenter.showData(dataProvider2);

    }
}


interface DataProvider {
    String getData(); // metoda bez ciała - nie mamy definicji metody

}


class SimpleDataProvide implements DataProvider {
    @Override
    public String getData() {
        return "raz dwa trzy";
    }
}


class FileDataProvider implements DataProvider {
    @Override
    public String getData() {
        try {
            return new String(Files.readAllBytes(Paths.get("src/data.txt")));
        }
        catch (IOException e) {
            return "Błąd: " + e.getMessage(); // Muismy to dodać bo metoda readAllBytes zgłasza błedy które musimy obsłużyć
        } // np że plik pusty,
    }
}

class DataPresenter {
    public static void showData(DataProvider dataProvider) { // dzięki temu nasza metoda jest bardziej ogólna bo nie musi znąc klas które jeszcze nie są utworzone, ale będzie je w stanie obsłużyć, bo ta metoda przyjmuje wszytskie obikety klas o daym interfejsie, takto trzeba by było definiować nową albo uwzględniac różńe rzeczy
        System.out.println(dataProvider.getData());
    }
}