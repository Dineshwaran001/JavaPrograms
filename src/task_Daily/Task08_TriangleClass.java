package task_Daily;

import java.util.Scanner;

public class Task08_TriangleClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Left side length of Triangle");
        int triangleLeft = scan.nextInt();
        System.out.println("Enter the Right side length of Triangle");
        int triangleRight = scan.nextInt();
        System.out.println("Enter the Below side length of Triangle");
        int triangleBelow = scan.nextInt();
        if(triangleLeft==triangleRight && triangleLeft==triangleBelow){
            System.out.println("it is Equilateral Triangle");
        } else if (triangleLeft!=triangleRight && triangleLeft==triangleBelow) {
            System.out.println("It is Isoceles  Triangle");
        } else if(triangleLeft != triangleBelow && triangleRight==triangleLeft){
            System.out.println("It is Isoceles Triangle");
        } else  {
            System.out.println("it is scalene Triangle");
        }
    }
}



