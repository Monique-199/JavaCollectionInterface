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
        current.next=newNode;
    }
    public void deleteByValue(int value){
        if(head==null){
            return;
        }
        //if the value we want to delete is at the head
        if(head.data==value){
            head=head.next;
            return;
        }
        Node current=head;
        while(current!=null){
            if(current.next.data==value){
                current.next=current.next.next;
                return;
            }
            current=current.next;
        }
    }
    public void deleteAtIndex(int index) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        //deleting at first index
        if (index == 0) {
            head = head.next;
            return;
        }
        //Traversing to the given index
        Node current = head;
        for (int i = 0; i < index - 1; i++) {
            if (current == null || current.next == null) {
                System.out.println("Index out of bounds.");
                return;
            }
            current = current.next;
        }
        if (current.next == null) {
            System.out.println("Index out of bounds");
            return;
        }
        current.next = current.next.next;
    }
    public void reverse(){
        Node prev=null;
        Node current= head;
        Node next =null;

        while(current!=null){
            next=current.next;//save next
            current.next=prev; // reverse the link
            prev=current; // Move prev forward
            current= next; //Move current forward
        }
        head=prev; //reset head
    }
}
