package ex_31_Collections_Framework_DSA.List.Comparator;

import java.util.Collections;
import java.util.Comparator;
import java.util.*;
public class Lab219_Comparator {
    public static void main(String[] args) {
        Student2 d1 = new Student2("Dinesh", 60,98);
        Student2 d2 = new Student2("Punisher", 35,65);
        Student2 d3 = new Student2("Gunner", 36,25);
// store the class in a list use the reference of the list in Collections to sort or any other operation
        List<Student2> students2list = new ArrayList();
        students2list.add(d1);
        students2list.add(d2);
        students2list.add(d3);
        //like below what ever we want custom sortinf can be done by comparator
        //create custom class for each {name, age, rollNo}
        //
         Collections.sort(students2list, new ageComparator());
     //   Collections.sort(students2list, new rollNoComparator());
       // Collections.sort(students2list, new nameComparator());
        System.out.println(students2list);
    }
}

class nameComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 s3, Student2 s4) {
        return s3.getName().compareTo(s4.getName());
    }
}

class rollNoComparator implements Comparator<Student2> {

    @Override
    public int compare(Student2 s1, Student2 s2) {
        return s1.getRollN0() - s2.getRollN0();
    }
}
class ageComparator implements Comparator<Student2>{

    @Override
    public int compare(Student2 o1, Student2 o2) {
        return o1.getAge()- o2.getAge();
    }
}
class Student2{
    private String name;
    private int age;
    private int rollN0;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getRollN0() {
        return rollN0;
    }

    public void setRollN0(int rollN0) {
        this.rollN0 = rollN0;
    }

    public Student2(String name, int age, int rollN0) {
        this.name = name;
        this.age = age;
        this.rollN0 = rollN0;
    }
    @Override
    public String toString() {
        return "Student2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", rollN0=" + rollN0 +
                '}';
    }


}