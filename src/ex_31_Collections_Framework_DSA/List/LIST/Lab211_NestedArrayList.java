package ex_31_Collections_Framework_DSA.List.LIST;

import java.util.ArrayList;
import java.util.List;

public class Lab211_NestedArrayList {
    public static void main(String[] args) {
        List<String> fruit = new ArrayList();
        fruit.add("Apple");
        fruit.add("Grapes" );
        fruit.add( "banana");
        System.out.println("fruit1"+fruit);

        List fruit2 = new ArrayList();
        fruit2.add("Orange");
        fruit2.add("Mango");
        fruit2.add("Gauva");
        System.out.println("Fruit2"+fruit2);

    List Vegetables = new ArrayList();
    Vegetables.add("Potato");
    Vegetables.add("Cabbage");
    Vegetables.add("Tomato");
        System.out.println("Vegetable"+Vegetables);

        List fruitVegetable = new ArrayList();
        fruitVegetable.add(fruit); //1st list
        fruitVegetable.add(fruit2);//2nd list
        fruitVegetable.add(Vegetables);//3rd list
        System.out.println("These will merge all the array list:"+fruitVegetable);


    }
}
