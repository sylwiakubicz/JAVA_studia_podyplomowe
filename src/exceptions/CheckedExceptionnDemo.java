package exceptions;

import java.net.MalformedURLException;
import java.net.URL;

public class CheckedExceptionnDemo {
    public static void main(String[] args) {
        CheckedExceptionnDemo ced = new CheckedExceptionnDemo();
        ced.urlTesterByTryCatch("http://wszib.edu.pl");
        ced.urlTesterByThrows("http://wszib.edu.pl");
    }

    public void urlTesterByTryCatch(String urlStr) {
        try {
            URL url = new URL(urlStr);
            System.out.println("Protocol: " + url.getProtocol());
            System.out.println("Host: " + url.getHost());
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public void urlTesterByThrows(String urlStr) {

    }
}

