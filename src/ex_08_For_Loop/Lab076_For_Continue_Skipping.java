package ex_08_For_Loop;

public class Lab076_For_Continue_Skipping {
    public static void main(String[] args) {
        for (int i = 0; i < 10 ; i++) {
            if(i==6){// once i =6 continue will not go below it will again go to condition
                continue;// skip below code and move to top
            }
            System.out.println(i); // this will not execute when 1=6
        }
    }
}
