package LinkedList.prepend;

public class main {
    public static void main(String[] args) {
        LinkedList LL = new LinkedList(1);
        LL.makeEmpty();
        LL.append(23);
        LL.append(5);
        LL.append(6);
        System.out.println("Head Currently: " + LL.getHead().value); //Head before prepend method
        LL.prepend(11);
        LL.printAll();
    }
}
