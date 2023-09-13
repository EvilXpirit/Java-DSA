package LinkedList.removeLast;

public class main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList(1);
        LL.append(22);
        LL.append(13);
        LL.append(14);
        LL.append(6);
        //LL.remove(); this will only remove the item
        System.out.println("Removed item: " + LL.remove().value);
        System.out.println("Removed item: " + LL.remove().value);
        System.out.println("Tail is at right now" + LL.getTail().value);
        System.out.println("Removed item: " + LL.remove().value);
        System.out.println("Removed item: " + LL.remove().value);
//        System.out.println("Removed item: " + LL.remove().value);
        System.out.println("Removed item: " + LL.remove().value);
        //LL.printAll();

    }
}
