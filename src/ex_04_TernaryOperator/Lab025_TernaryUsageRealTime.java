package ex_04_TernaryOperator;

public class Lab025_TernaryUsageRealTime {
    public static void main(String[] args) {
         int x= 10;
         int y= 20;
        System.out.println(Math.max(x,y));

        String max = x>y? "X is maximum": "Y is maximum"; //X<Y so it is printed
        System.out.println(max);


    }

}
