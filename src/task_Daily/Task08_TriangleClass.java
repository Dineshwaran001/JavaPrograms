package task_Daily;

import java.util.Scanner;

public class Task08_TriangleClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int triangleLeft = scan.nextInt();
        int triangleRight = scan.nextInt();
        int triangleBelow = scan.nextInt();

        if (triangleLeft<=0 || triangleBelow<=0 ||triangleRight<=0){
            System.out.println("this is not a triangle");
            System.exit(0);
        }

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



