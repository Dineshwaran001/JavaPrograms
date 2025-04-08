package ex_016_OOPs;

public class Lab133_Class_IQ {
}
class P1{ }
class P2{ }
//class 123{ } check identifier rules nor possible
class $123{}
class _123{}
//class _123{}  duplicate class not possible
//class $1234{}  ,class $1234{}   this is not possible

class p4{}; // semi colon also possible

class p5{
    class p6{
        class p7{
            // class within class also possible {any number of times is possible}
        }
    }
}
 class checkMain {
     public static void main(String[] args) {
         System.out.println("this is one entity");
         System.out.println("After JDK(JVM) 13 it is allowed");
         System.out.println("You have unlimited number of class they will seperately run");
         System.out.println("here you have single file but multiple class and multiple main()-> possible");
         System.out.println("We will run one at a time not simultaenously");
     }
        }
class checkMain1 {
    public static void main(String[] args) {
        System.out.println("this is Another entity");
        System.out.println("After JDK (JVM)13 it is allowed");
        System.out.println("You have unlimited number of class they will seperately run");
        System.out.println("here you have single file but multiple class and multiple main()-> possible");
        System.out.println("We will run one at a time not simultaenously");
    }
}