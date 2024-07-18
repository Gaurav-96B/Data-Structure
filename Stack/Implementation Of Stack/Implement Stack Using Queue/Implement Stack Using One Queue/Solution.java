import java.util.*;
class Stack {
    Queue < Integer > q1 = new LinkedList < > ();

    public void push(int x) {
        //  Get previous size of queue
        int s = q1.size();

        // Push the current element
        q1.add(x);

        // Pop all the previous elements and put them after
        // current element
        for (int i = 0; i < s; i++) {
            q1.add(q1.poll());
        }

    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void pop() {
        // if no elements are there in q1
        if (q1.isEmpty()) {
            return;
        }
        q1.remove();
    }

    public int size() {
        return q1.size();

    }

    public int peek() {
        if (q1.isEmpty()) {
            return -1;
        }
        return q1.peek();
    }

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        System.out.println("current size: " + stack.size());
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());
        stack.pop();
        System.out.println("current size: " + stack.size());
        System.out.println(stack.isEmpty());
    }
}
