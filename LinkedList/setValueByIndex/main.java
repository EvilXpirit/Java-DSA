package LinkedList.setValueByIndex;

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
        System.out.println(ll.set(4, 6));
        System.out.println(ll.get(4).value + "\n");
        ll.printAll();

//        System.out.println("Head is: " + ll.getHead().value); // using getHead() method
//        System.out.println("Tail is: " + ll.getTail().value);

    }
}
