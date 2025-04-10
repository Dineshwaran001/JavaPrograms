package task_Daily;

public class Task15_Class_A_B {
    public static void main(String[] args) {
        // this pgm is for just creating class and methods
        Person p1 = new Person();
         p1.speak(); //no para no return(void)
        String n = p1.Hi(); // no para with return
        p1.name("Dinesh"); // with para without return(void)
        String mentor_exp= p1.mentorship_Exp("Three year");
        System.out.println(n);
        System.out.println(mentor_exp);

    }
}
class Person{
    String name;
    byte age;
    long mob;
    double salary;
    double tax;
    String education;
    int mentoring;

    void speak(){
        System.out.println("without param without return");

    }
    static String Hi(){
        System.out.println("j");
        return "dinesh";
    }
    void name (String name){
        System.out.println(" with param without return");

    }
    String mentorship_Exp(String mentoring){

        return mentoring;
    }

}
