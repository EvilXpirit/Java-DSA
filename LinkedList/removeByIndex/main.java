package LinkedList.removeByIndex;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.append(7);
        ll.append(23);
        ll.append(45);
        ll.append(99);
        ll.append(9);
        System.out.println(ll.get(4).value + "\n");
        ll.printAll();
        System.out.println("Item remove: " + ll.remove(2).value);
//        System.out.println("Item remove: " + ll.remove(0).value);
        System.out.println(ll.get(4).value + "\n");
        ll.printAll();

//        System.out.println("Head is: " + ll.getHead().value); // using getHead() method
//        System.out.println("Tail is: " + ll.getTail().value);

    }
}

