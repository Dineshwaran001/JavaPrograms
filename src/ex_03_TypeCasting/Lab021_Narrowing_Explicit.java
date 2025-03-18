package ex_03_TypeCasting;

public class Lab021_Narrowing_Explicit {
    public static void main(String[] args) {
        int g= 400;
        byte h = (byte) g; // Narrowing-->Explicit only used--> because convert bigger into small data type
        System.out.println(h);
        // this will not throw error.
        //It will convert 400 into byte code -->110010000--> total 9 digits
        //byte have only 8 bits to store so they take--> 10010000--> only last 8 digits
        //they convert into a decimal number and store into byte
        //Because of 1 starting in binary number it will give the negative number as output -112
        //if it is 0starting in binary number it will give the Positives number as output
    }
}
