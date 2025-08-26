package ex_03_Operators;

public class Lab011_RelationalOperators {
    public static void main(String[] args) {
        // relational operators wil only return Boolean output
        // == equal to
        //> greater than
        // >= greater than or equal to
        //< less than
        // <= less than or equal to
        // ?= not equal to
        //
        int a= 10;
        int b= 12;
        System.out.println(a==b);// this will return false because 10 not equal to 12.

        int c= 12;
        int d = 12;
        System.out.println(c==d);// this will return true because 12 equal to 12.

        int votingAge =18;
        int your_age= 16;
        System.out.println(your_age>=votingAge);// this will return false because 16 not equal or grater than to 18.

        int a_votingAge =18;
        int b_yourage = 19;
        System.out.println(b_yourage >= a_votingAge);// this will return true because 19 greater than to 12.
        // any one of the condition is passed it will return true
    }
}
