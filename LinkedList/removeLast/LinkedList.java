package LinkedList.removeLast;

public class LinkedList {
private Node head;
private Node tail;
private int length;

class Node {
    int value;
    Node next;

    Node(int value) {
        this.value = value;
    }
}

    public LinkedList(int value){
        Node newNode = new Node( value);
        head = newNode;
        tail = newNode;
        length = 1;
    }
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }
    public Node getHead(){
        return head;
    }
    public Node getTail(){
        return tail;
    }
    public int getLength(){
        return length;
    }
    public void printAll() {
        if (length == 0) {
            System.out.println("Head: Null");
            System.out.println("Tail: Null");
        } else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        if (length == 0) {
            System.out.println("Empty");
        } else {
            printList();
        }
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length==0){
            head = newNode;
            tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
        length++;
    }

    public Node remove(){
    if (length == 0)
//    if (head == null) alternative way to check if LL is empty
        return null;
    Node pre = head;
    Node temp = head;
    while(temp.next != null){
        pre = temp;
        temp = temp.next;
    }
    tail = pre;
    pre.next = null;
    length--;
    if (length == 0){
        head = null;
        tail = null;
    }
    return temp;
    }

}


