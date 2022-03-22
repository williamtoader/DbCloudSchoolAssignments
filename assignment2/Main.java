package com.company.assignment2;

import java.util.Map;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        //Student
        Student.addStudentToGradeMap(new Student("Wiliam", 9.49));
        Student.addStudentToGradeMap(new Student("Ionel", 5.59));
        Student.addStudentToGradeMap(new Student("Acest student a avut ghinion", 4.49));
        Student.addStudentToGradeMap(new Student("Matei", 7.40));
        Student.addStudentToGradeMap(new Student("Acest student a avut noroc", 4.51));
        Student.addStudentToGradeMap(new Student("Andrei", 9.39));

        for(int i = 0; i <= 10; ++i) {
            System.out.println("Nota " + i + ": ");
            System.out.println(Student.roundedGradesMap.get(i).toString());

        }

        //MyList
        MyList<Integer> integerMyList = new MyList<>(5);

        try {
            integerMyList.add(1);
            integerMyList.add(2);
            integerMyList.add(3);
            integerMyList.add(4);
            integerMyList.add(5);
            integerMyList.add(6);
        }
        catch (RuntimeException e) {
            System.err.println(e.toString());
        }

        integerMyList.print();
        System.out.println(integerMyList.lookup(2));
        System.out.println(integerMyList.lookup(6));


    }
}
