package kol3;

import java.util.Objects;

public class Car {
    String color;
    String brand;
    String year;

    public Car(String color, String brand, String year) {
        this.color = color;
        this.brand = brand;
        this.year = year;
    }

    public Car(String brand) {
        this.brand = brand;
        this.year = "2024";
        this.color = "white";
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", year='" + year + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Car car = (Car) o;
        return Objects.equals(color, car.color) && Objects.equals(brand, car.brand) && Objects.equals(year, car.year);
    }


}
