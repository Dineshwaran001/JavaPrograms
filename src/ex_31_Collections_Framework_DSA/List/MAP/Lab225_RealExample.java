package ex_31_Collections_Framework_DSA.List.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab225_RealExample {
    public static void main(String[]args) {
        Map<String, Object> Student_1 = new HashMap();
        Student_1.put("Name", "dinesh");
        Student_1.put("RollNo", 1);
        Student_1.put("Salary", 30000);
        Student_1.put("Address", "chennai");

        Map<String, Object> Student_2 = new HashMap();
        Student_2.put("Name", "waran");
        Student_2.put("RollNo", 2);
        Student_2.put("Salary", 50000);
        Student_2.put("Address", "Madras");

        List Student_list = new ArrayList();
        Student_list.add(Student_1);
        Student_list.add(Student_2);
        System.out.println(Student_list);
    }
}
