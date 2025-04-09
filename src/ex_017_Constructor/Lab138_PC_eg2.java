package ex_017_Constructor;

public class Lab138_PC_eg2 {
    public static void main(String[] args) {
        Person p1 = new Person("Matt", 8248818138l,"24, Hell's kitchen,");
        Person p2 = new Person("Punisher", 9392939029l, "32, Hells Kitchen");
        System.out.println(p1.name+" "+ p1.mobile+" "+ p1.address);
        System.out.println(p2.name+" "+ p2.mobile+" "+ p2.address);
        p1.eat(); //calling method using object AND this keyword
        p2.eat();
        Person p3 = new Person();
        p3.name ="dinesh";// in this object is created in the previous line
    }
}
class Person{
    String name;
    long mobile;
    String address;

    Person(){
        //noting written here
    }
    Person(String name_arg , long mobile_arg, String address_arg){
        this.name=name_arg;
        this.mobile=mobile_arg;
        this.address= address_arg;

    }
    void eat(){
        System.out.println(this.name+" "+ "is Eating");
    }
}
