package task_Daily;

public class Task014_Even_Odd_Arrays {
    public static void main(String[] args) {
        int[]a={11,22,33,44,55,66,77,88,99,100};
//        int[] even; // we store it in an array
//        int[] odd;
        for (int i = 0; i <a.length ; i++) {
            if (a[i]%2==0){
              //  even= new int[a[i]];
                System.out.println("it is even-->"+a[i]);
            } else {
                //odd= new int[a[i]];
                System.out.println("it is odd-->"+a[i]);
            }

        }
    }
}
