package ex_07_Switch;

public class Lab045_SwitchChar {
    public static void main(String[] args) {
        char ch ='A';
        switch (ch){
            case 65:// it will match because char is also integer
                System.out.println("It will match ASCII");
                break;
            default:
                System.out.println("It is not match with ASCII");
                break;

        }
    }
}
