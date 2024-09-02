package lab18;

import java.util.Objects;

public class User {
    private String name;
    private String nazwisko;
    private int age;

    public User(String name, String nazwisko, int age) {
        this.name = name;
        this.nazwisko = nazwisko;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age && Objects.equals(name, user.name) && Objects.equals(nazwisko, user.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, nazwisko, age);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", age=" + age +
                '}';
    }
}
