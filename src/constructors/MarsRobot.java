package constructors;

public class MarsRobot {
    String status;
    int speed;
    int power;

    MarsRobot(String status, int speed, int power) {
        this.status = status;
        this.speed = speed;
        this.power = power;
    }

    public static void main(String[] args) {
        MarsRobot marsRobot = new MarsRobot("eksploracja", 4, 5);
        MarsRobot marsRobot2 = new MarsRobot("powrót do bazy", 7, 10);

        System.out.println(marsRobot.status);
        System.out.println(marsRobot2.status);


    }
}
