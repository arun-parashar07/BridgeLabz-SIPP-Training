package problems.stacksqueues;

import java.util.Stack;

public class SortStackRecursively {
    public void sort(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            int temp = stack.pop();
            sort(stack);
            insert(stack, temp);
        }
    }

    private void insert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
        } else {
            int temp = stack.pop();
            insert(stack, element);
            stack.push(temp);
        }
    }
}
