package DLL;

public class DoublyLinkedList {//The train
    Node head;//first car
    Node tail;// last car

    //Adding a car, insert at the end
    void append(int data){
        Node newNode = new Node(data);//make a new car with the number inside
        if(head==null){//the list is empty
           head=tail=newNode;//make this car the first and the last car
           return;
        }
        tail.next=newNode;//link the last car to the new one
        newNode.prev=tail;// link the new one back to the last
        tail = newNode;
    }
    //Remove a car/ deletion
    void delete(Node node){
        if (node == null) {//list is empty
            return;
        }
        if(node.prev!=null)//not the first car
            node.prev.next=node.next;//make the previous car skip this one
        else
            head=node.next;
        //move the head to the next car.
        if(node.next!=null)//if it is not the last car
            node.next.prev=node.prev;//make the next car skip this one
            else
            tail=node.prev;//move the tail to the previous car


    }
    //
    // Printing forward
    void printForward(){
        Node temp=head;//starting at the front car
        while(temp!=null){//while we have a car
            System.out.print(temp.data + " ");//print its number
            temp=temp.next; //move to the next car
        }
        System.out.println();
    }
    //print backward
    void printBackward(){
        Node temp = tail;//start at the last car
        while(temp!=null){// while we have a car
            System.out.print(temp.data + " ");//print its number
            temp=temp.prev;//move to the previous car
        }
        System.out.println();
    }
    //printing the list
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node temp = head;
        while (temp != null) {
            sb.append(temp.data).append(" ");
            temp = temp.next;
        }
        return sb.toString().trim();
    }
    Node find(int value){
        Node temp = head;
        while(temp!=null){
            if(temp.data==value){
                return temp;
}
            temp=temp.next;
}
        return null;}
}