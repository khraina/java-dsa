 
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

public void append(int value) {
    Node newnode=new Node(value);
    if(head==null){
        head=newnode;
        tail=newnode ;
        
    }
    else
    {
        tail.next=newnode;
        tail=newnode;
    }
    length++;
}

public void makeEmpty(){
    head=null;
    tail=null;
    length=0;
}


public void removeLast(){
    if(head==null) return null;
    
    Node temp=head;
    Node pre=head;
    while(temp.next!=null){
        pre=temp;
        temp=temp.next;
    }
    tail=pre;
    tail.next=null;
    length--;
    if(length==0){
        head=null;
        tail=null;
    }

    return temp;


}

public static void main(String[] args) {
    LinkedList mylist = new LinkedList(3);
    mylist.makeEmpty();
    //Testing the methods to add
    mylist.append(5);
    mylist.append(8);
    System.out.println(mylist);
        mylist.getHead();
        mylist.getTail();
        mylist.getLength();

        System.out.println("\nLinked List:");
        mylist.printList();

        System.out.println(mylist.removeLast().value);
        // (1) Item - Returns 1 Node
        System.out.println(mylist.removeLast().value);
        // (0) Items - Returns null
        System.out.println(mylist.removeLast());
}

}



