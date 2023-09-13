package LinkedList;

import java.sql.SQLOutput;

public class LinkedList {
    //The LinkedList class contains a reference to the head (the first node)
    //  and the tail (the last node) of the linked list,
    // as well as the length of the list.
    private Node head;  // Node here refers to inner class
    //you are creating a reference variable named head of type Node.
    // Node refers to inner nested class and also a custom data type
    // This variable head will store a reference to the first node of the linked list.
    private Node tail;
    private int length;

    class Node {
        //The Node class is a private inner class of the LinkedList class,
        // which means it can only be accessed within the LinkedList class.
        // It represents the individual nodes of the linked list.
        // it is also a use as a user defined data type
        // Each node has an integer value and a reference to the next node (next).
        int value;
        Node next;   //next is pointer that is used for traversal
        // ,linking the nodes in sequential order
        //, each individual node will have a value and a next node pointing to the next node which will have the same
        Node(int value){
            this.value = value;
        } //it assigns the value passed as an argument to the value field of the node.
    }

    public LinkedList(int value){
        //The LinkedList constructor initializes a new linked list with a
        // single node containing the provided value.
        // The head, tail, and length are updated accordingly.
            Node newNode = new Node(value); //this runs the constructor for node class and actually creates a node
        // newNode is a variable that store reference to the Node(value) object of the Node class that holds the value
            head = newNode;
            tail = newNode;
            length = 1;
        }

        public void printList(){
            Node temp = head;  //it is a pointer which is used for traversal, it points at head initially
            while( temp != null){
                System.out.println(temp.value);
                temp = temp.next; // it updates the temp pointer to next node which is null right now so loop stops

            }
        }
        public void getHead(){
            System.out.println("Head is " + head.value );
        }
        public void getTail(){
            System.out.println("Tail is " + tail.value );
        }
        public void getLength(){
            System.out.println("Length is " + length );
        }


}
