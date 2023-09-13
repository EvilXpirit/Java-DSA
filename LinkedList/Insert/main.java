package LinkedList.Insert;

public class main {
    public static void main(String[] args) {
        LinkedList ll = new LinkedList(1);
        ll.makeEmpty();
        ll.append(1);
        ll.append(23);
        ll.append(45);
        ll.append(99);
        ll.insert(2, 69);
        ll.append(9);
        System.out.println("Set: " + ll.set(4, 6));
        System.out.println("value get: " +  ll.get(4).value);
        System.out.println("value inserted: " + ll.get(2).value + "\n");
        ll.printAll();
    }
}
