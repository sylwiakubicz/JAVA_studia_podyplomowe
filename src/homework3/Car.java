package homework3;

class Car {
    int year;
    String color;
    String model;

    String[] colors = {"silver", "black", "blue"};
    int[] years = {2018, 2019, 2020};
    String[] models = {"yaris", "corolla", "aygo"};

    public Car() {
        this.year = years[(int)(Math.random() * 3)];
        this.color = colors[(int)(Math.random() * 3)];
        this.model = models[(int)(Math.random() * 3)];
    }

}


