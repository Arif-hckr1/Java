package HappyFamily2;

import java.util.HashMap;
import java.util.Objects;

public class Human {
    enum DayOfWeek {
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;
    }

    private String name;
    private String surname;
    private int year;
    private int iq;
    private String[][] schedule;

    public Human(String name, String surname, int year, int iq, String[][] schedule) {
        this.name = name;
        this.surname = surname;
        this.year = year;
        this.iq = iq;
        this.schedule = schedule;
    }

    public Human() {}

    public Human(String name) {
        this.name = name;
    }

    public void greetPet(Pet pet) {
        System.out.println("Hello, " + pet.getNickname());
    }

    public String getName() { return name; }
    public String getSurname() { return surname; }
    public int getYear() { return year; }
    public int getIq() { return iq; }
    public String[][] getSchedule() { return schedule; }

    @Override
    public String toString() {
        return "Human{name= '" + name + "', surname= " + surname + ", year= " + year + ", iq= " + iq + "}";
    }
}
