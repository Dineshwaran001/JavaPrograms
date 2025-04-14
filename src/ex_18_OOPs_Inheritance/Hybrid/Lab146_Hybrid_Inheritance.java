package ex_18_OOPs_Inheritance.Hybrid;

public class Lab146_Hybrid_Inheritance {
    public static void main(String[] args) {

    }
}
class Animals{
void eat(){
    System.out.println("This animal can eat");
}
}
class Dog extends Animals{
void bark(){
    System.out.println("Dog can bark");
}
}
class cat extends Animals{
    void meow(){
        System.out.println("Cat can meow");
    }
}
class puppy extends Dog{
    void cry(){
        System.out.println("Puppy will cry");
    }
}