package ex_31_MultiThreading;

public class Thread04 {
    public  static void main(String[] args) {
        Runnable w1 = new Worker(); // up casting
        Thread t1 = new Thread(w1); // passing runnable reference
        t1.start(); // start using reference dot start
        //run(); if we call like this -> it wil be treated like normal oops program -> not like thread
        //that's why we call these using start method

        Runnable w2 = new Worker();
        Thread t2 = new Thread(w2);
        t2.start();
        t2.setPriority(7);// you can set priority also between 1 t0 10
    }
}
class Worker implements Runnable{


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