package ex_03_TypeCasting;

public class Lab_022_TypeCastingExample {
    public static void main(String[] args) {
        int courseFee =200;
        float gst = 36.5f;
       // int total =courseFee+gst;// narrow implicit is not possible it show error incompatible
        int total= courseFee+(int)gst; // this is possible because we use Explicitly
        // but always there will be a data loss when we use Explicitly
        System.out.println(total);// output: 236

        //below program defines when we use big data type we can able to store correctly
        float total1= courseFee+gst;// Widening Implicit
        float total2= (float)courseFee+gst;// Widening Explicit also possible
        System.out.println(total1);// output:236.50
        System.out.println(total2);// output:236.50
    }
}
