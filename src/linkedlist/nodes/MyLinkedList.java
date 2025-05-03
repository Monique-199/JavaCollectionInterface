package linkedlist.nodes;

public class MyLinkedList {
    Node head;//pointer to the first node in the list
    //Method to add a new node at the end
    public void add(int data){
        Node newNode = new Node(data);//creates a new node with the given data

        //if list is empty
        if(head==null){
            head=newNode;// make the new node as head
            return;
        }
        //otherwise, traverse to the last node and insert the new node there
        Node current= head;
        while (current.next!=null){
            current=current.next;
        }
        current.next=newNode;


        }
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");

    }


}
