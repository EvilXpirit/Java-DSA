package LinkedList.FindMIddle;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.append(1);
        ll.append(23);
        ll.append(45);
        ll.append(99);
        ll.printAll();
//        System.out.println("Head is: " + ll.getHead().value); // using getHead() method
//        System.out.println("Tail is: " + ll.getTail().value);
        System.out.println("Middle Node is: " + ll.findMiddleNode().value);
    }
}

