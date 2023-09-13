package LinkedList.setValueByIndex;


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

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " ");
            temp = temp.next;
        }
        System.out.println("");
    }

    public Node getHead() {
        return head; // these returned value can be used later by other code when we call the method
    }

    public Node getTail() {
        return tail;
    }

    public int getLength() {
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
        System.out.println("These are all Linked list Items");
        if (length == 0) {
            System.out.println("Empty");
        } else {
            printList();
        }
    }

    public void makeEmpty() {
        head = null;
        tail = null;
        length = 0;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode; //the next pointer points to the newNode, it connects tail or last node to the newNode
            tail = newNode; //tail pointer points to the newNode
        }
        length++;
    }
    public Node get(int index){
        if(index<0 || index>=length) return null;
        Node temp = head;
        for(int i = 0; i<index; i++){
            temp = temp.next;
        }
        return temp;
    }

    public boolean set(int index, int value){
        Node temp = get(index);
        if(temp != null){
            temp.value = value;
            return true; // the method immediately exits after this if it returns true
        }
        return false;
    }

}


