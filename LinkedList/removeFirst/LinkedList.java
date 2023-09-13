package LinkedList.removeFirst;

public class LinkedList {
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
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value){
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;
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

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void printAll(){
        if(length == 0){
            System.out.println("Head: " + null);
            System.out.println("Tail: " + null);
        }
        else {
            System.out.println("Head: " + head.value);
            System.out.println("Tail: " + tail.value);
        }
        System.out.println("Length: " + length);
        System.out.println("All elements of the linked list");
        if(length == 0){
            System.out.println("Empty");
        }
        else {
            printList();
        }
    }

    public Node removeFirst(){
        if (length == 0) return null;
        Node temp = head;
        head = head.next; // if head's next is null then head will point to null or nothing
        temp.next = null;
        length--;
        if (length == 0){
//            head = null;
            tail = null;
        }
        return temp;
    }

}
