package task_Daily;

public class Task05_UserInputCLITernary {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int  b = Integer.parseInt(args[1]);
         int result = (a > b) ? a: b;
         //above we can use Math class also for maximum number
        System.out.println(  result + " " +" is Greater number");

    }
}
