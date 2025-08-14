import java.util.*;

public class StackUsingQueues {
    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
        q1.add(x);
    }

    public int pop() {
        while (q1.size() > 1)
            q2.add(q1.remove());
        int popped = q1.remove();
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return popped;
    }

    public int top() {
        while (q1.size() > 1)
            q2.add(q1.remove());
        int top = q1.peek();
        q2.add(q1.remove());
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }

    public static void main(String[] args) {
        StackUsingQueues stack = new StackUsingQueues();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println("Top: " + stack.top());
        System.out.println("Popped: " + stack.pop());
    }
}
