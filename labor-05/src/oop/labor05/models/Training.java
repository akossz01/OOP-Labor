package oop.labor05.models;

import java.util.ArrayList;

public class Training {
    private Course course;
    private MyDate startDate;
    private MyDate endDate;
    private double pricePerStudent;
    private ArrayList<Student> enrolledStudents;

    public Training(Course course, MyDate startDate, MyDate endDate, double pricePerStudent) {
        this.course = course;
        this.startDate = startDate;
        this.endDate = endDate;
        this.pricePerStudent = pricePerStudent;
    }

    public boolean enroll(Student student) {
        for (Student s : enrolledStudents) {
            if (s.getID().equals(student.getID())) {
                return false;
            }
        }
        enrolledStudents.add(student);
        return true;
    }

    public Student findStudentById(String ID) {
        for (Student s : enrolledStudents) {
            if (s.getID().equals(ID)) {
                return s;
            }
        }
        return null;
    }

    public Course getCourse() {
        return course;
    }

    @Override
    public String toString() {
        return "Training{" +
                "course=" + course +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", pricePerStudent=" + pricePerStudent +
                ", enrolledStudents=" + enrolledStudents +
                '}';
    }

    public void unEnroll(String student) {
        for (Student s : enrolledStudents) {
            if (s.getID().equals(student)) {
                s = null;
            }
        }
    }
}
