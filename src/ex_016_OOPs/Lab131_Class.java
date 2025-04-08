package ex_016_OOPs;

public class Lab131_Class {
    public static void main(String[] args) {
        Person p1 = new Person(); // every time we need to create an object for diffrent object
        p1.name="dinesh";
        p1.age=25;
        p1.colour="brown";
        Person p2 = new Person();// every time we need to create an object for diffrent object
        p2.name="waran";
        p2.age= 25;
        p2.colour="black";
        Person p3 = new Person();
        System.out.println(p1.name);
        System.out.println(p2.name);
        System.out.println(p1.age);
        System.out.println(p2.age);
        System.out.println(p1.salary);// we dont assign salary for p2
        System.out.println(p3.name);// we dont assign salary for p3 so Null
    }
}
class Person{ // this is blue print we created
    String name;
    byte age;
    String colour;
    double salary;
    int mob_number;
    double tax;



     void studying(){
        System.out.println("Im studying");
    }

     String greet(String name){
        return name;
     }

     double salaryAfterTax(double salary, double tax){
         return salary-tax;
     }

}
