package exercise5;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stack = new StackOfStrings();

        stack.push("one");
        stack.push("two");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
