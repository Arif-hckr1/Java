package lesson6.models;

import lesson6.interfaces.Teachable;
import java.util.List;

public class Teacher extends Human implements Teachable {
    private List<String> subjects;

    public Teacher(String name, int age, String email, String phone, String gender, List<String> subjects) {
        super(name, age, email, phone, gender);
        this.subjects = subjects;
    }

    @Override
    public void teach(String subject) {
        System.out.println(name + " is teaching " + subject);
    }

    public List<String> getSubjects() {
        return subjects;
    }
}
