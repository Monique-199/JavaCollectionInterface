package queues;


import java.util.LinkedList;
import java.util.Queue;

public class CoffeeShopQueue {
    public static void main(String[] args) {
        //create a queue using LinkedList(FIFO)
        Queue<String> coffeeQueue = new LinkedList<>();

        //people join the queue
        coffeeQueue.add("Alice"); // Alice joins the queue
        coffeeQueue.add("Bob"); //Bob joins the queue behind Alice
        coffeeQueue.offer("Charlie");// charlie joins at the end

        System.out.println("Queue: "+coffeeQueue);//prints queue state

        //peek : who is next to be served
        String next = coffeeQueue.peek(); //Alice is next but still in line
        System.out.println("Next to be served: "+next);

        //serve people (remove from the front)
        String served = coffeeQueue.poll();//Alice gets served and leaves the queue
        System.out.println("served: "+served);

        System.out.println("Queue after serving one person: "+coffeeQueue);

        //Remove another person (throws exception if empty)
        served=coffeeQueue.remove();//Bob is removed/served
        System.out.println("Served: "+served);

        System.out.println("Final queue: "+coffeeQueue);
    }
}
