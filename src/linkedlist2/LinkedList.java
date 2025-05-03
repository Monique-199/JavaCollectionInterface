package linkedlist2;
import linkedlist2.Node;
public class LinkedList {
    Node head; //first car

    //add a new car to the train
    public void add(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;

    }
    //show all cars in the train
    public void printList(){
        Node current=head;

        while (current!=null){
            System.out.print(current.data+"->");
            current=current.next;
        }
        System.out.println("null");
    }
    //insert node at given index
    public void insertAt(int index, int data){
        Node newNode = new Node(99);
        //we are inserting at index 0
        if(index==0) {
            newNode.next = head;
            head = newNode;
            return;
        }
        //if not we traverse to the given index
        Node current=head;
        int position =0;
        while(current!=null && position<index-1){
            current=current.next;
            position++;

        }
        if(current==null){
            System.out.println("Index out of bounds");
            return;
        }
        newNode.next=current.next;
        
    }
}
