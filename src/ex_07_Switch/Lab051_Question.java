package ex_07_Switch;

public class Lab051_Question {
    public static void main(String[] args) {
        int a =10;//
// condition we given in switch is not -> a it is -1 so it will match with -1 and print o/P
        switch (-1) { // which one is match in the given bracket of switch--> it is print in 0/p
                default:
                System.out.println("this is default");
                break;
                case -1: // this will print because it is in switch bracket
                System.out.println("this is -1");
                break;
                case 10:
                    System.out.println("this is 10");
                    break;
        }
    }
}
