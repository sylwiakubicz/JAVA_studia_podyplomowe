package nospecifycategory;

public class StringChecker {
    public static void main(String[] args) {
        String str = "Lannister zawsze spłaca swoje długi.";
        System.out.println("Text to: " + str);
        System.out.println("Dłuość tekstu: " + str.length());
        System.out.println("Znak na pozycji 6: " + str.charAt(6));
        System.out.println("Znaki pomiędzy 10. a 16.: " + str.substring(10, 16));
    }
}
