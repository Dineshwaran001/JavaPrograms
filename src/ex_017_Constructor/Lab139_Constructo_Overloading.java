package ex_017_Constructor;

public class Lab139_Constructo_Overloading {
    public static void main(String[] args) {
        Person1 p1 = new Person1("dinesh",989897876l, "24 Hells kitchen");
        Person1 p2 = new Person1("dinesh",9999900);
    }
}
class Person1{
    String name;
    long mobile;
    String address;

    Person1(){
        //noting written here
    }
    Person1(String name_arg , long mobile_arg, String address_arg){
        this.name=name_arg;
        this.mobile=mobile_arg;
        this.address= address_arg;
    }
    Person1(String name_arg , long mobile_arg){
        this.name=name_arg;
        this.mobile=mobile_arg;
        System.out.println("this is constructor overloading same PC with diffrent attributes thats it");
    }

    void eat(){
        System.out.println(this.name+" "+ "is Eating");
    }
}
