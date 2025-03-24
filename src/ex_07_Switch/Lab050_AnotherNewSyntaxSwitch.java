package ex_07_Switch;

public class Lab050_AnotherNewSyntaxSwitch {
    public static void main(String[] args) {
        //JDK>13 only support -> we can use multiple cases in one case
        int a = 01;
        switch (a){
            case 01,02,03: // we can use multiple cases in one
                System.out.println("this is int a value");
            case 04,05,06:// we can use multiple cases in one
                System.out.println("this is int a value");
            default:
                System.out.println("This is out of value given");
        }
    }
}
