public class Stack {
    private int arr[];
    private int size;
    private int top;

    public Stack(int size) {
        this.size = size;
        this.arr = new int[size];
        this.top = -1;
    }

    public void push(int a) {
        if (top == size - 1) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            arr[top] = a;
        }
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top = top - 1;
        }
    }

    public int size() {
        return top + 1;
    }

    public int peek() {
        return arr[top];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(6);
        stack.push(5);
        System.out.println("Current size of stack is: " + stack.size());
        stack.push(10);
        stack.push(15);
        stack.push(20);
        stack.push(25);
        stack.push(30);
        System.out.println("Current size of stack is: " + stack.size());

        // Attempting to push into a full stack
        stack.push(35);

        // Accessing the top element
        System.out.println("At present, the top element in stack is: " + stack.peek());

        // Removing all the elements from the stack
        for (int i = 0; i < 6; i++) {
            stack.pop();
        }
        System.out.println("Current size of stack is: " + stack.size());

        // Attempting to pop from an empty stack
        stack.pop();

        System.out.println("Is Stack Empty : " + stack.isEmpty());

    }
}
