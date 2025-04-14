package ex_019_Polymorphism;

public class Lab148_Poly_Real {
    public static void main(String[] args) {
        Home hm = new Home();
        int task1 = hm.task(5);
        int task2 = hm.task(5, 6);
        String task3= hm.task("Dinesh","Waran");
        System.out.println(task1);
        System.out.println(task2);
        System.out.println(task3);
    }

}
class Home{
    int  task(int a){
       // System.out.println("Small task");
        return a;
    }
    int  task(int a, int b){
       // System.out.println("Big task");
        return a+b;
    }
    String  task(String a, String b){
       // System.out.println("Big task");
        return a+b;
    }
}
