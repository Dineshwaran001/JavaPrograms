package task_Daily;

public class Task04_UserInputCLI {
    public static void main(String[] args) {
        String name = args[0];
        int age = Integer.parseInt(args[1]);
        double salary = Double.parseDouble(args[2]);
        System.out.println(name);
        System.out.println(age);
        System.out.println(salary);
    }
}
