package lab17;

public class DirectionsTester {
    public static void main(String[] args) {
        for (Directions directions: Directions.values()) {
            System.out.println(directions);
        }

        System.out.println();
        System.out.println(Directions.valueOf("N").getNameEn());
    }
}
