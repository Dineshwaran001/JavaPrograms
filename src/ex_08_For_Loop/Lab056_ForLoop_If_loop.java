package ex_08_For_Loop;

public class Lab056_ForLoop_If_loop {
    public static void main(String[] args) {
        for(int dinesh=0 ; dinesh<18; dinesh++){ // when dinesh becomes 18 it will not go inside
           if (dinesh>16){ // dinesh after 16 means--> 17 he will go out(below statement execute)
               System.out.println("Dinesh will go out");
           } else { //0 to 16  it will execute
               System.out.println("dinesh will not");
           }
        }
    }
}
