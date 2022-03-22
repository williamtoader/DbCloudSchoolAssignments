package com.company.assignment2;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Student implements Comparable<Student>{
    private String name = "";
    private double grade = 0;

    public Student(String name, double grade) {
        this.name = name;
        this.grade = grade;
    }

    public static Map<Integer, TreeSet<Student>> roundedGradesMap = new HashMap<>();

    static {
        for(int i = 0; i <= 10; ++i) {
            roundedGradesMap.put(i, new TreeSet<Student>());
        }
    }

    public static void addStudentToGradeMap(Student s) {
        roundedGradesMap.get((int)Math.round(s.getGrade())).add(s);
    }

    public double getGrade() {
        return grade;
    }

    @Override
    public int compareTo(Student o) {
        return - Double.compare(grade, o.getGrade());
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", grade=" + grade +
                '}';
    }
}
