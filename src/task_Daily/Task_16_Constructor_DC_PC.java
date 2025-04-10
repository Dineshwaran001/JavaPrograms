package task_Daily;

public class Task_16_Constructor_DC_PC {
    public static void main(String[] args) {
        Cons_Dc_Pc c1 = new Cons_Dc_Pc();
        Cons_Dc_Pc c2 = new Cons_Dc_Pc("dinesh", 16, "Hells kitchen", 98123281l, true);
        Cons_Dc_Pc c3 = new Cons_Dc_Pc("waran", 32, "no 2, Hells kitchen", 98123281l, true);
        System.out.println(c1.name);
        System.out.println(c2.name);
        System.out.println(c3.name);
        c2.eat();
        c3.sleep();
       System.out.println(c1.name +" "+c1.age+" "+c1.address+" "+ c1.phone+" "+ c1.isMale);
       System.out.println(c2.name +" "+c2.age+" "+c2.address+" "+ c2.phone+" "+ c2.isMale);
       System.out.println(c3.name +" "+c3.age+" "+c3.address+" "+ c3.phone+" "+ c3.isMale);

    }
}
class Cons_Dc_Pc{
    String name;
    int age;
    String address;
    long phone;
    boolean isMale;
    Cons_Dc_Pc(){
name="Unknown";
age =0;
address="XXX";
phone= 0l;
isMale = true || false;
    }
    Cons_Dc_Pc(String arg_name, int arg_age , String arg_address, long arg_phone , boolean arg_isMale){
this.name=arg_name;
this.age= arg_age;
this.address= arg_address;
this.phone=arg_phone;
this.isMale =arg_isMale;
    }
    void eat(){
        System.out.println(name+" is Eating");
    }
    void sleep(){
        System.out.println(name +" Is Sleeping");

    }
    void doHomework(){
        System.out.println("Doing Home work");
    }


}
