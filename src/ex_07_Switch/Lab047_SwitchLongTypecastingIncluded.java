package ex_07_Switch;

public class Lab047_SwitchLongTypecastingIncluded {
    public static void main(String[] args) {
        long a = 5678L;
        switch ((int)a){
            // this is also allowed (including type casting)
            case 5678:
                System.out.println("98");
                break;
            default:
                System.out.println("a");
        }
    }
}
