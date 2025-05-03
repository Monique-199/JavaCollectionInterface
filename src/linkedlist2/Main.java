package linkedlist2;

public class Main {
    public static void main(String[] args){
        LinkedList train = new LinkedList();
        train.add(23);
        train.add(56);
        train.add(76);
        train.add(26);
        train.add(51);
        train.printList();
        train.insertAt(1,99);
        train.printList();
        train.deleteByValue(76);
        train.printList();
        train.deleteAtIndex(1);
        train.printList();
    }
}
