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
        Node nodeToDelete = list.find(30);
        list.delete(nodeToDelete);

        list.deleteAt(2);
        System.out.print("After deleting at index 2: ");
        list.printForward();

        list.insertAt(2,35);
        System.out.print("After inserting 35 at index 2: ");
        list.printForward();


    }
}

