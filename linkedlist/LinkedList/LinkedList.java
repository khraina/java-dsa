 
public class LinkedList{
    private Node head;
    private Node tail;
    private int length;


class Node{
    int value;
    Node next;

    Node(int value){
        this.value = value;
    }
}

public LinkedList(int value){
    Node newNode= new Node(value);
    head=newNode;
    tail=newNode;
    length=1;
}

public void printList() {
    Node temp = head;
    while (temp != null) {
        System.out.println(temp.value);
        temp = temp.next;
    }
}

public void getHead() {
    if (head == null) {
        System.out.println("Head: null");
    } else {
        System.out.println("Head: " + head.value);
    }
}

public void getTail() {
    if (head == null) {
        System.out.println("Tail: null");
    } else {
        System.out.println("Tail: " + tail.value);
    }
}

public void getLength() {
    System.out.println("Length: " + length);
}
public static void main(String[] args) {
    LinkedList mylist = new LinkedList(3);
    System.out.println(mylist);
    mylist.getHead();
        mylist.getTail();
        mylist.getLength();

        System.out.println("\nLinked List:");
        mylist.printList();
}

}



