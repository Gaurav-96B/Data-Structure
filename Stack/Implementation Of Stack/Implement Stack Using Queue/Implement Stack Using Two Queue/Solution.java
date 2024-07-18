                          /*Implement Stack using Queues by making pop() operation costly */
-------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Stack {
    Queue < Integer > q1 = new LinkedList < > ();
    Queue < Integer > q2 = new LinkedList < > ();

    public void push(int x) {
        q1.add(x);

    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void pop() {
        if (q1.isEmpty())
            return;

        // Leave one element in q1 and
        // push others in q2.
        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.poll();
        }

        // Pop the only left element
        // from q1
        q1.poll();

        // swap the names of two queues
        Queue < Integer > q = q1;
        q1 = q2;
        q2 = q;
    }

    public int size() {
        return q1.size();

    }

    public int peek() {
        if (q1.isEmpty())
            return -1;

        while (q1.size() != 1) {
            q2.add(q1.peek());
            q1.poll();
        }

        // last pushed element
        int temp = q1.peek();

        // to empty the auxiliary queue after
        // last operation
        q1.poll();

        // push last element to q2
        q2.add(temp);

        // swap the two queues names
        Queue < Integer > q = q1;
        q1 = q2;
        q2 = q;
        return temp;
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

                            /*Implement Stack using Queues By making push() operation costly*/
---------------------------------------------------------------------------------------------------------------------------------------------
import java.util.*;
class Stack {
    Queue < Integer > q1 = new LinkedList < > ();
    Queue < Integer > q2 = new LinkedList < > ();

    public void push(int x) {
        q2.add(x);

        // Push all the remaining
        // elements in q1 to q2.
        while (!q1.isEmpty()) {
            q2.add(q1.peek());
            q1.poll();
        }

        // swap the names of two queues
        Queue < Integer > q = q1;
        q1 = q2;
        q2 = q;

    }

    public boolean isEmpty() {
        return q1.isEmpty();
    }

    public void pop() {
        // if no elements are there in q1
        if (q1.isEmpty())
            return;
        q1.poll();
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
