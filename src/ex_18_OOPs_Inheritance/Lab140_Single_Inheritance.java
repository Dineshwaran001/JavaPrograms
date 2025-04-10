package ex_18_OOPs_Inheritance;

public class Lab140_Single_Inheritance {
    public static void main(String[] args) {
        Dad d = new Dad();
        System.out.println(d.goldGrams);
        d.house();
        son s = new son();
        s.house();
        System.out.println(" gold is not available for son so we use extends keyword in son to access" );
        System.out.println(s.goldGrams);
    }
}
class Dad{
    int goldGrams = 1000;
    void house(){
        System.out.println("2bhk");
    }
}

class son extends Dad { // we use extends to use dad properties
    void house() {
        System.out.println("2bhk");
    }
}