package linkedlist;
import java.util.LinkedList;


public class LinkedListExample {
    public static void main(String[] args){
        LinkedList<String> fruits = new LinkedList<>();
        //adding elements
        fruits.add("Apple");
        fruits.add("banana");
        fruits.add("Cherry");
        System.out.println(fruits);
        //add at the beginning
        fruits.addFirst("Orange");
        System.out.println(fruits);
        //add at the end
        fruits.add("Kiwi");
        System.out.println(fruits);
        //remove at the end
        fruits.removeLast();
        System.out.println(fruits);
        //remove an element
        fruits.remove("Banana");
        System.out.println(fruits);
        //remove at index
        fruits.remove("Apple");
        System.out.println(fruits);
        //add at index
        fruits.add(2,"Pineapple");
        System.out.println(fruits);
        //get first and last
        System.out.println("First fruit: "+ fruits.getFirst());
        System.out.println("last fruit: " + fruits.getLast());

        //get all the elements
        System.out.println(fruits);

        //loop through
        for(String fruit :fruits){
            System.out.println(fruit);
        }
    }
}
