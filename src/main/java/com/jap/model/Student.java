/*
 *Author Name : Seetha Lakshmi.G.M
 *Date : 18-09-2022
 *Created With : IntelliJ IDEA Community Edition
 */


package com.jap.model;

import java.util.Objects;
import java.util.StringJoiner;

public class Student {

    private int rollNumber;
    private String name;
    private int grades;

    private double totalMarks;

    public Student() {
    }

    public Student(int rollNumber, String name, int grades, double totalMarks) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grades = grades;
        this.totalMarks = totalMarks;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGrades() {
        return grades;
    }

    public void setGrades(int grades) {
        this.grades = grades;
    }

    public double getTotalMarks() {
        return totalMarks;
    }

    public void setTotalMarks(double totalMarks) {
        this.totalMarks = totalMarks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && grades == student.grades && Double.compare(student.totalMarks, totalMarks) == 0 && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, grades, totalMarks);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]").add("rollNumber=" + rollNumber).add("name='" + name + "'").add("grades=" + grades).add("totalMarks=" + totalMarks).toString();
    }
}
