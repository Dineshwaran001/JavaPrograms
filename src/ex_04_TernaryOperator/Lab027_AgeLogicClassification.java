package ex_04_TernaryOperator;

public class Lab027_AgeLogicClassification {
    public static void main(String[] args) {
       String age1 = args[0]; // name is age 1
         int age= Integer.parseInt(age1); // type conversion
        //above we change age1 String into int data type(age)
       String result= (age<18)? "minor":(age>65)?"Senior Citizen": "Adult";
        System.out.println(result);
    }
}
