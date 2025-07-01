package ex_23_OOPs_Abstraction;

public class Lab160_Oops_Abstract {
    public static void main(String[] args) {
        Car c =  new Car();
        c.drive();
        c.Start();
        c.Stop();
    }
}
 abstract class Engine{
    abstract void Start();
     abstract void Stop();

 }

 class Car extends Engine{

     @Override
     void Start() {
         System.out.println("Start");
     }

     @Override
     void Stop() {
         System.out.println("Stop");
     }

     void drive(){
//         Start();
//         Stop();
     }
 }