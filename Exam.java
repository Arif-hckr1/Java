package lesson6.models;

import lesson6.interfaces.Gradable;

public class Exam implements Gradable {
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

    public Course getCourse() {
        return course;
    }

    @Override
    public int getScore() {
        return score;
    }

    @Override
    public String getGrade() {
        if (score >= 90) return "A";
        else if (score >= 80) return "B";
        else if (score >= 70) return "C";
        else if (score >= 60) return "D";
        else return "F";
    }

    @Override
    public String toString() {
        return student.getName() + " - " + course.getCourseName() + ": " + score + " (" + getGrade() + ")";
    }
}
