package ex_31_Collections_Framework_DSA.List.QUEUE;

import java.util.ArrayDeque;
import java.util.Deque;

public class Lab222_ArrayDeque {
    public static void main(String[] args) {
        Deque<Integer> deck = new ArrayDeque();
        deck.push(15);
        deck.push(10);
        System.out.println(deck);
        //FIFO -->15 is first inserted [15] and 10 is second inserted [10,15] so o/p is [10,15]
    }
}
