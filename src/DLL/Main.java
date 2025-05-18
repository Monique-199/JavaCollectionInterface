package DLL;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.append(10);
        list.append(20);
        list.append(30);
        list.append(40);
        list.append(50);

        System.out.println("Forward:");
        list.printForward();

        System.out.println("Backward:");
        list.printBackward();
        //list.delete(3);


    }
}
