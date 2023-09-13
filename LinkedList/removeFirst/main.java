package LinkedList.removeFirst;

public class main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList(1);
        LL.append(2);
        LL.append(13);
        LL.append(14);
        LL.append(6);
        //LL.remove(); this will only remove the item
        System.out.println("Removed item: " + LL.removeFirst().value);
        System.out.println("Removed item: " + LL.removeFirst().value);
        System.out.println("Head is at right now " + LL.getHead().value);
        System.out.println("Removed item: " + LL.removeFirst().value);
        System.out.println("Removed item: " + LL.removeFirst().value);
        System.out.println("Removed item: " + LL.removeFirst().value);
        LL.printAll();

    }
}
