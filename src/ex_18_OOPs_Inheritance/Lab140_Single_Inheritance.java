package ex_18_OOPs_Inheritance;

public class Lab140_Single_Inheritance {
    public static void main(String[] args) {
        Dad d = new Dad();
        System.out.println(d.goldGrams);
        d.house();
        son s = new son();
        s.house1();

        System.out.println(" gold is not available for son so we use extends keyword in son to access" );
        System.out.println(s.goldGrams);
        s.house();//access the properties and behaviour from paraent to child possible
//        d.house1(); //access the properties and behaviour from child to parent is not possible
    }
}
class Dad{
    int goldGrams = 1000; //attribute| data variable, instance variable, property
    void house(){ //behaviour, data members, methods, functions
        System.out.println("2bhk");
    }
}

class son extends Dad { // we use extends to use dad properties
    void house1() {
        System.out.println("2bhk");
    }
}