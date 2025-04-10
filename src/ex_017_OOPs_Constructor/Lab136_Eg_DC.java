package ex_017_OOPs_Constructor;

public class Lab136_Eg_DC {
    public static void main(String[] args) {
        Car c = new Car();
        c.name= "Tesla"; // if you want to change you can give here
        System.out.println(c.name);// otherwise it will take some default values from constructor
        System.out.println(c.year_released);
        System.out.println(c.model);
        System.out.println(c.engine);

        Car c1 = new Car();
        // value will be taken from Default constructor if you want to change you can change here
        // c1.name= "AUDI";
        System.out.println(c1.name);// otherwise it will take some default values from constructor
        System.out.println(c1.year_released);
        System.out.println(c1.model);
        System.out.println(c1.engine);
    }
}
 class Car{
    String name;
    int year_released;
    String model;
    String engine;

    Car(){
        name= "Unknown car";
        year_released= 1999;
        model = "XXX";
        engine = "100CC Engine";
        System.out.println("Real usages");
        System.out.println("DC is used to initialize some values");
    }
 }