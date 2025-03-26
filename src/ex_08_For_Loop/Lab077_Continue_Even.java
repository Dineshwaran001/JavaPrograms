package ex_08_For_Loop;

public class Lab077_Continue_Even {
    public static void main(String[] args) {
        for (int i = 1; i <=50 ; i++) {
            if (i%2 !=0){ //%2= 0 means even not% means it it even so it will skip
                continue;
            }
            System.out.println("This is even -->" + i);
        }
    }
}
