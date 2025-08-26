package ex_32_MultiThreading;

public class Thread01 {
   public static void main(String[] args) throws InterruptedException {
       //single threads;
       //          [#1 is thread ID] [main-> is name] [5 is priority] [main-> name of thread group]
       Thread t = Thread.currentThread();//Thread[#1,main,5,main]
       System.out.println(t);
       for (int i = 0; i <10 ; i++) {
           System.out.println(i+"-<-Index Loop--LoopName->-"+t.getName()); // name is main
           System.out.println(i+"-<-Index Loop--Priority of Loop->-"+t.getPriority());
           Thread.sleep(5000);
       }
    }
}
