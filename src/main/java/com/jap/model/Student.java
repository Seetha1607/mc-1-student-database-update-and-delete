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

    public Student() {
    }

    public Student(int rollNumber, String name, int grades) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grades = grades;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return rollNumber == student.rollNumber && grades == student.grades && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(rollNumber, name, grades);
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", Student.class.getSimpleName() + "[", "]").add("rollNumber=" + rollNumber).add("name='" + name + "'").add("grades=" + grades).toString();
    }
}
