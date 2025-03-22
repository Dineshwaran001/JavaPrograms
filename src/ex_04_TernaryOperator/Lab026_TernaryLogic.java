package ex_04_TernaryOperator;

public class Lab026_TernaryLogic {
    public static void main(String[] args) {
        int n1 = 5;
        int n2 = 10;
        int n3 = -5;
        //condition use brackets
                      //true this execute        //false this execute
        int maximum = (n1>n2) ? (n1>n3) ? n1 :n3:(n2>n3) ? n2: n3;
        System.out.println(maximum);
        //n1>n2 // FALSE
        //n1>n3 // FALSE
        //n2>N3 //

    }
}
