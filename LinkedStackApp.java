import models.Stack;

public class LinkedStackApp {
    public static void main(String[] args) {
        Stack myStack = new Stack();

        for (int i = 0; i < 5; i++) {
            myStack.push(i);
        }

        System.out.println(myStack);

        while (!myStack.isEmpty()) {
            System.out.println(myStack.pop() + " removed.");
            System.out.println(myStack);
        }
    }
}
