package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.*;

public class Lab215_StudentProgram {
    public static void main(String[] args) {
        Student s = new Student("dinesh", 1);
        Student s1 = new Student("Aravind", 2);
        Student s2 = new Student("ponvan", 3);
        List studentList = new ArrayList();
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);
        System.out.println(studentList);
    }

}

