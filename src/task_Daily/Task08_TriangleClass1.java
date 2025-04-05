package task_Daily;

import java.util.Scanner;

public class Task08_TriangleClass1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the side 1");
        int side1 = scan.nextInt();
        System.out.println("Enter the side 2");
        int side2 = scan.nextInt();
        System.out.println("Enter the side 3");
        int side3 = scan.nextInt();
       //if < = 00 length means it is not a triangle thats why condition is here
        if (side1<=0 || side2<=0 ||side3<=0){
            System.out.println("this is not a triangle");
            System.exit(0);
        }
/*Explanation of the condition: below
Side 1 + Side 2 <= Side 3: This checks if the sum of side1 and side2 is less than or equal to side3.
 If this is true, then the sides cannot form a triangle because the sum of the two sides is too small to close the shape.
Side 2 + Side 3 <= Side 1: This checks if the sum of side2 and side3 is less than or equal to side1.
 If this is true, again the sides cannot form a triangle.
Side 1 + Side 3 <= Side 2: This checks if the sum of side1 and side3 is less than or equal to side2.
 If this is true, the sides cannot form a valid triangle either.
*
* */
        if (side1+ side2 <= side3 || side2+side3<= side1 || side1+side3<=side2){
            System.out.println("this is not a triangle");
            System.exit(0);
        }
        if(side1==side2 && side2==side3){
            System.out.println("Equilateral");
        } else if (side1 == side2 ||side2 ==side3 ||side1==side1){
            System.out.println("Isoceles");
        }
        else {
            System.out.println("Scalene");
        }
    }
}
