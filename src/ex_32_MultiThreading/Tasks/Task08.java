package ex_32_MultiThreading.Tasks;

public class Task08 {
    public static void main(String[] args) throws Exception {
        MyWorker t1 = new MyWorker();
        t1.start();

        Thread.sleep(1000);
        System.out.println( t1.getName() + " - "+t1.getState());

        Thread.sleep(1000);
        System.out.println( t1.getName() + " - "+t1.getState());

    }
}

class MyWorker extends Thread {

    @Override
    public void run()  {
        Thread th = Thread.currentThread();
        for (int i = 0; i < 10; i++) {
            System.out.println(th.getName() + i +" - "+ th.getState());
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}