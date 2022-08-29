package com.cydeo;

import java.util.*;
import java.util.stream.Collectors;

public class ArrayListReview {
    public static void main(String[] args) {
        //Create Arraylist
        List<Student> students = new ArrayList<>();
        //Add elements
        students.add(new Student(1, "Annie"));
        students.add(new Student(2, "Bob"));
        students.add(new Student(3, "Claire"));
        students.add(new Student(4, "Diana"));

        //Iteration
        // For loop with get(i)
        System.out.println("                       Printing with legacy for-loop             ");
        for (int i = 0; i < students.size(); i++) {
            System.out.println(students.get(i));
        }// can specify indexes and get to element you need

        // 2. Iterator
        // Forward Iteration
        System.out.println("                       Printing with iterator                  ");
        Iterator iter = students.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }// cannot jump from one specific index to another


        // Backwards Iteration
        System.out.println("                         Backwards                 ");

        while (((ListIterator<?>) iter).hasPrevious()) {
            System.out.println(((ListIterator<?>) iter).previous());
        }
        // 3. for each loop
        System.out.println("                           For Each            ");
        for (Student eachStudent : students) {
            System.out.println(eachStudent);
        }
        // 4. Lambda
        System.out.println("                           Lambda  ");
        students.forEach(student -> System.out.println(student));
        // Sorting Elements in List
        System.out.println("                           Sorting with Comparator Interface by Id Descending  ");
        Collections.sort(students, new sortByIdDescending());
        students.forEach(student -> System.out.println(student));

        System.out.println("Sorting with Comparator Interface by Name Desc......");
        Collections.sort(students, new sortByName());
        students.forEach(student -> System.out.println(student));


    }

    static class sortByIdDescending implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.id - o1.id;
        }
    }

    static class sortByName implements Comparator<Student> {
        @Override
        public int compare(Student o1, Student o2) {
            return o2.name.compareToIgnoreCase(o1.name);
        }
    }
}
