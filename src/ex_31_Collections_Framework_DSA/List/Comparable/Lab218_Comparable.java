package ex_31_Collections_Framework_DSA.List.Comparable;

import java.util.Collections;
import java.util.*;

public class Lab218_Comparable {
    public static void main(String[] args) {
        Student s = new Student("Dinesh", 1, 65);
        Student s1 = new Student("Ganesh", 2, 50);
        Student s2 = new Student("Aravind", 3, 95);

        List<Student> studentList = new ArrayList();
        studentList.add(s);
        studentList.add(s1);
        studentList.add(s2);
        Collections.sort(studentList); //check comparable in below method based on that sort will happen it in name or age or roll no
        System.out.println(studentList);
        System.out.println("you can use only one for sorting either it is name or mark or roll no");
    }
}
class Student implements Comparable<Student>{
    // we have to implement Comparable interface in the same class and inside that pass the same class name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    private String name;
    private int rollNo;
    private int mark;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                ", mark=" + mark +
                '}';
    }

    public Student(String name, int rollNo , int mark) {
        this.name = name;
        this.rollNo = rollNo;
        this.mark =mark;
    }


   // @Override // compare and sorting using rollNo
//    public int compareTo(Student o) {
//        return this.rollNo-o.rollNo;
//    }

//    @Override // compare and sorting using rollNo
//    public int compareTo(Student o) {
//        return this.name.compareTo(o.name);
//    }
@Override  // sort based on mark
    public int compareTo(Student o) {
   return this.mark-o.mark;
    }

}
