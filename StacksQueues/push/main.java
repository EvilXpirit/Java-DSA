package StacksQueues.push;

public class main {

    public static void main(String[] args) {

        Stack myStack = new Stack(2);

        System.out.println("Before push():");
        System.out.println("--------------");
        myStack.printAll();

        myStack.push(1);

        System.out.println("\n\nAfter push():");
        System.out.println("-------------");
        myStack.printAll();


    }

}
