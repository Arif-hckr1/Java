package lesson6.models;

public class Course {
    private String courseName;
    private String courseCode;
    private Teacher teacher;
    private Student student;

    public Course(String courseName, String courseCode, Teacher teacher, Student student) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.teacher = teacher;
        this.student = student;
    }

    public String getCourseName() {
        return courseName;
    }

    public Student getStudent() {
        return student;
    }
}
