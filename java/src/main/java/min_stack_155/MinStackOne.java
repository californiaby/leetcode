package min_stack_155;

import java.util.Stack;

public class MinStackOne {
  Stack<Integer> stack;
  int min;

  public MinStackOne() {
    stack = new Stack<>();
    min = Integer.MAX_VALUE;
  }

  public void push(int x) {
    // if current value is new min - push old min to stack before pushing new value
    // will need that for pop
    if (x < min) {
      stack.push(min);
      min = x;
    }

    stack.push(x);
  }

  public void pop() {
    // if popped value isn't current min - we are fine
    // if it is - pop one more time to get previous min (which was pushed to stack before)
    if (stack.pop() == min) {
      min = stack.pop();
    }
  }

  public int top() {
    return stack.peek();
  }

  public int getMin() {
    return min;
  }

}
