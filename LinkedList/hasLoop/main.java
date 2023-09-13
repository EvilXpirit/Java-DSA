package LinkedList.hasLoop;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.append(1);
        ll.append(23);
        ll.append(45);
        ll.append(99);
        ll.printAll();

        // create a loop by connecting the tail to the second node
        ll.getTail().next = ll.getHead().next;

        System.out.println("Has Loop: " + ll.hasLoop());
    }
}

