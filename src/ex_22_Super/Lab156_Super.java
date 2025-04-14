package ex_22_Super;

public class Lab156_Super {
    public static void main(String[] args) {
        Car c = new Car();
        c.display();
        Car c2 = new Car(10);
        System.out.println(c2.wheel);

    }
}
class Vehicle{
    public int max_speed= 180;
int wheel;
    Vehicle(){ //
        System.out.println("Default constructor --> in parent class");
    }
     Vehicle(int wheel) {
        this.wheel=12;
         System.out.println("Param Constructor--> in parent class");
    }
    // below two are method overloading same method name diff argument
    void method(){
        System.out.println("method overloading with same name--> in parent class");
    }
    void method(int b){
        System.out.println("Method overloading same name different arg --> in parent class");
    }
    //
    void display(){
        System.out.println("This is normal method --> in parent class");
    }
}// open this class this is Parent class

class Car extends Vehicle{ // we extends vehicle here
private int max_speed = 200;
         Car(){
           super(); // this will call the parent class
         }
         Car(int wheel){

           super(1);// thos will execute parent
             System.out.println(this.wheel); // this refers to current object
         }
         // we are overriding method display here
    @Override
    void display(){
        System.out.println(this.max_speed); // this refer to the current class
        System.out.println(super.max_speed); // super is refer to the Parent class
        super.display();// parent display method
        super.method();
        super.method();

    }

}