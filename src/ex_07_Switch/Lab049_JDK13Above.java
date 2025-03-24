package ex_07_Switch;

public class Lab049_JDK13Above {
    public static void main(String[] args) {
        //JDK>13 only support
        int code = 001; // only 001 will execute
        // break is not required for this Switch syntax
        switch (code){
            case 001 -> System.out.println("89");
            case 002 -> System.out.println("90");
            case 003 -> System.out.println("8");
            default -> System.out.println("Not int");
        }


    }
}
