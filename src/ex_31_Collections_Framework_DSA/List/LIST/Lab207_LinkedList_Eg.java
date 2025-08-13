package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.LinkedList;

public class Lab207_LinkedList_Eg {
    public static void main(String[] args) {
        LinkedList<String> animals = new LinkedList();
        animals.add("Dog");
        animals.add("Cat");
        animals.addFirst("Lion");
        animals.addLast("Elephat");

        System.out.println("Total Animals: ->"+animals);
        animals.removeFirst();
        animals.removeLast();
        System.out.println("________________________________________");
        System.out.println("Removed Animals: ->"+animals);


    }
}
