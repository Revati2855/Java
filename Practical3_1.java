interface Stack {
    int size = 5;   // fixed size

    void push(int value);
    void pop();
    void display();
    boolean overflow();
    boolean underflow();
}

class IntegerStack implements Stack {
    int[] arr = new int[size];
    int top = -1;

    public void push(int value) {
        if (overflow()) {
            System.out.println("Stack Overflow! Cannot push " + value);
        } else {
            arr[++top] = value;
            System.out.println(value + " pushed into stack.");
        }
    }

    public void pop() {
        if (underflow()) {
            System.out.println("Stack Underflow! Cannot pop.");
        } else {
            System.out.println(arr[top--] + " popped from stack.");
        }
    }

    public void display() {
        if (underflow()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack elements are:");
            for (int i = top; i >= 0; i--) {
                System.out.println(arr[i]);
            }
        }
    }

    public boolean overflow() {
        return top == size - 1;
    }

    public boolean underflow() {
        return top == -1;
    }
}

public class Practical3_1 {
    public static void main(String[] args) {
        IntegerStack stack = new IntegerStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        stack.pop();
        stack.display();
    }
}
