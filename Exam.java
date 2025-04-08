package lesson6.models;

public class Exam {
    private Student student;
    private Course course;
    private int score;

    public Exam(Student student, Course course, int score) {
        this.student = student;
        this.course = course;
        this.score = score;
    }

    public Student getStudent() {
        return student;
    }

    public int getScore() {
        return score;
    }
}
