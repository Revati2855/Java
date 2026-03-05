import java.util.*;

public class Practical1_4 {
    public static void main(String[] args) {

        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);

        System.out.println("Stack Elements: " + stack);
        stack.pop();
        System.out.println("After Pop: " + stack);

        // Queue
        Queue<Integer> queue = new LinkedList<>();
        queue.add(100);
        queue.add(200);
        queue.add(300);

        System.out.println("Queue Elements: " + queue);
        queue.remove();
        System.out.println("After Remove: " + queue);
    }
}
