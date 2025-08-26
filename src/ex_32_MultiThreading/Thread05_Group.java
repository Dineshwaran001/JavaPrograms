package ex_32_MultiThreading;

public class Thread05_Group {
    public static void main(String[] args) {

        ThreadGroup tg = new ThreadGroup("Workers");
        Runnable w01 = new Worker1(); // up casting
        Thread t01 = new Thread(w01); // passing runnable reference
        t01.start(); // start using reference dot start
        //run(); if we call like this -> it wil be treated like normal oops program -> not like thread
        //that's why we call these using start method

        Runnable w2 = new Worker();
        Thread t2 = new Thread(w2);
        t2.start();
        t2.setPriority(7);// you can set priority also between 1 t0 10
    }
    }


class Worker1 implements Runnable{


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

