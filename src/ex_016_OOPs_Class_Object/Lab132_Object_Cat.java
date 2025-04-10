package ex_016_OOPs_Class_Object;

public class Lab132_Object_Cat {
    public static void main(String[] args) {
        Cat c1 = new Cat();// this is object --> total 1
        Cat c2;// this is reference -->without an object
        c1.running();
//        c2.running(); // this will throw error because object is not created for c2
        new Cat();//this is also an object--> total 2
        new Cat().running();// we can call this method also without creating object
        System.out.println(new Cat().name);// this will throw null --> total  4 object
    }
}
class Cat{

    String name;
    void running(){
        System.out.println("It will run");
    }
}
