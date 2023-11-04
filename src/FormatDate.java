import java.util.StringTokenizer;

public class FormatDate {

    public static void main(String[] args) {
        String date = "29/04/2016";
        StringTokenizer st1 = new StringTokenizer(date);
        System.out.println("Day: " + st1.nextToken("/"));
        System.out.println("Month: " + st1.nextToken("/"));
        System.out.println("Year: " + st1.nextToken("/"));
    }
}
