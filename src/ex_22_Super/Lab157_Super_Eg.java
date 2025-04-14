package ex_22_Super;

public class Lab157_Super_Eg {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.display();// this will call child class


    }

}
class God {
    void sound(){
        System.out.println("God SOund!");
    }
}
class Animal extends God{
    protected String color= "white";
    void sound(){
        System.out.println("sound hear");
        super.sound();// this will call parent God-->check God sound method
    }

}
class Dog extends Animal{
    private String color="Black";

    void display(){
        System.out.println(this.color);
        System.out.println(super.color);
        super.sound();// this will call the parent class Animal-> check animal sound method
    }
}