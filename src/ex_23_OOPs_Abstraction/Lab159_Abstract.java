package ex_23_OOPs_Abstraction;

public class Lab159_Abstract {

    public static void main(String[] args) {

        Child c = new Child();
        c.loan50K();
        c.loan25k();

    }

}
abstract class Father{
    abstract void loan50K();
     void loan25k(){
        System.out.println("loan 25k");
    }
}
class Child extends Father{

    @Override
    void loan50K() {
        System.out.println("child pay the loan");
    }
}