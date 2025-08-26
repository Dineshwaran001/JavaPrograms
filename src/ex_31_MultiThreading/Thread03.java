package ex_31_MultiThreading;

public class Thread03 {

    public static void main(String[] args) {
        ThreadGroup threadGroup = new ThreadGroup("Work");

        Workers w1 = new Workers(threadGroup,"W1"); //with these you can check which code is running
        w1.start();
        Workers w2 = new Workers(threadGroup,"W2");
        w2.start();

        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }

}
class Workers extends Thread{

    Workers(ThreadGroup threadGroup, String name){
super(threadGroup,name);
    }
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try{
                System.out.println(Thread.currentThread().getName());
                Thread.sleep(2000);
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}