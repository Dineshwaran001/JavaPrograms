package ex_31_Collections_Framework_DSA.List.QUEUE;

import java.util.PriorityQueue;

public class Lab220_QUEUE {
    public static void main(String[] args) {
        // Queue -> 0.001% in Automation
        PriorityQueue q = new PriorityQueue();
        q.add("Dinesh");
        q.add("Waran");
        q.add("Tinesh");
        // PQ -> Natural - Sorting - for the least element(first)
        //FIFO- first in first out--> which one will come in First will come out first
        System.out.println(q);
        System.out.println(q.peek());
        System.out.println(q);
        System.out.println(q.poll());
        System.out.println(q);


    }
}
