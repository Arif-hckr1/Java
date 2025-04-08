package lesson6.models;

import java.util.ArrayList;
import java.util.List;

public class Student extends Human {
    private List<Course> courses = new ArrayList<>();

    public Student(String name, int age, String email, String phone, String gender) {
        super(name, age, email, phone, gender);
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCourses() {
        return courses;
    }
}
