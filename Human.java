package lesson6.models;

public abstract class Human {
    protected String name;
    protected int age;
    protected String email;
    protected String phone;
    protected String gender;

    public Human(String name, int age, String email, String phone, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.phone = phone;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }
}
