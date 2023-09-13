package LinkedList.reverse;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.append(1);
        ll.append(23);
        ll.append(45);
        ll.append(99);
        ll.append(9);
        ll.append(46);
        ll.append(54);
        ll.printAll();
        ll.reverse();
        ll.printAll();

    }
}

