package ex_019_Polymorphism;

public class Lab150_MethodOverriding_poly {
    public static void main(String[] args) {
        Animal d1 = new Dog(); //Super Class referenceAnimal and  object is DOg
        d1.sound();//
        System.out.println("It is a relationsship between sub Class and Super class");
    }
}
class Animal{
    void sound(){
        System.out.println("Animal make sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
        System.out.println("Dog Bark");
    }
}
