package lesson6;

import lesson6.models.*;
import lesson6.service.DataGenerator;
import lesson6.service.JsonWriter;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> students = DataGenerator.createStudents();
        List<Teacher> teachers = DataGenerator.createTeachers();
        List<Course> courses = DataGenerator.assignCourses(students, teachers);
        List<Exam> exams = DataGenerator.createExams(courses);

        JsonWriter.writeToJson("students.json", students);
        JsonWriter.writeToJson("teachers.json", teachers);
        JsonWriter.writeToJson("courses.json", courses);
        JsonWriter.writeToJson("exams.json", exams);

        System.out.println("Məlumatlar JSON fayllara yazıldı.");
    }
}
