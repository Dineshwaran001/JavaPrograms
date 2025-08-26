package ex_31_Collections_Framework_DSA.List.QUEUE;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Lab221_LinkedList {
    public static void main(String[] args) {
        //because we use Linked List here thats why it will give output based on Insertion Order
        Queue<Integer> queue = new LinkedList();
        queue.add(6);
        queue.add(1);
        queue.add(8);

        Iterator<Integer> iterator = queue.iterator();
        while(iterator.hasNext()) {
            Integer value = iterator.next();
            System.out.println(value);
        }
    }
}
