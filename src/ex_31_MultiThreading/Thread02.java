package ex_31_MultiThreading;

public class Thread02 {
    public static void main(String[] args) {
        //single threads
        Thread t = Thread.currentThread();
        System.out.println("Name->"+t.getName()+"-"+ t.getThreadGroup() +"-"+"Priority-->"+ t.getPriority());

    }
}
