package ex_07_Switch;

public class Lab052_Question1 {
    public static void main(String[] args) {
        char code = 'C';
        switch (code){
            default:
                System.out.println("default will print because nothing will match");
                break;
            case 'A':
                System.out.println("65");
                break;
            case 'B':
                System.out.println("66");
                break;
        }
    }
}
