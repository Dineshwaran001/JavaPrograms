package task_Daily;

public class Task03_IncrementDecrement {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(++a + a++ + a++);
        System.out.println(a);
        // ++a = 11
        //a++ = 11 after this -->a value is 12
        //a++ =12 after this -->a value is 13
        //total 11+11+12=34
        // a value is 13
    }
}
