package lesson6.service;

import lesson6.models.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class DataGenerator {
    public static List<Student> createStudents() {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Ali", 20, "ali@mail.com", "123456", "Male"));
        students.add(new Student("Aysel", 21, "aysel@mail.com", "234567", "Female"));
        students.add(new Student("Murad", 22, "murad@mail.com", "345678", "Male"));
        students.add(new Student("Nigar", 23, "nigar@mail.com", "456789", "Female"));
        students.add(new Student("Rauf", 24, "rauf@mail.com", "567890", "Male"));
        return students;
    }

    public static List<Teacher> createTeachers() {
        return Arrays.asList(
                new Teacher("Elvin", 35, "elvin@mail.com", "111111", "Male", Arrays.asList("Math", "Physics")),
                new Teacher("Lala", 30, "lala@mail.com", "222222", "Female", Arrays.asList("Biology", "Chemistry"))
        );
    }

    public static List<Course> assignCourses(List<Student> students, List<Teacher> teachers) {
        List<Course> courses = new ArrayList<>();
        Random random = new Random();

        for (Student student : students) {
            for (int i = 0; i < 2; i++) {
                Teacher teacher = teachers.get(random.nextInt(teachers.size()));
                String courseName = "Course " + (i + 1);
                String courseCode = "C" + random.nextInt(1000);
                Course course = new Course(courseName, courseCode, teacher, student);
                student.addCourse(course);
                courses.add(course);
            }
        }

        return courses;
    }

    public static List<Exam> createExams(List<Course> courses) {
        List<Exam> exams = new ArrayList<>();
        Random random = new Random();

        for (Course course : courses) {
            int score = random.nextInt(101);
            exams.add(new Exam(course.getStudent(), course, score));
        }

        return exams;
    }
}
