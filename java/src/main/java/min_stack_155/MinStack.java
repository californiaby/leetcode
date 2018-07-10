package min_stack_155;


import java.util.Stack;

public class MinStack {
  Stack<Integer> values;
  Stack<Integer> mins;

  /** initialize your data structure here. */
  public MinStack() {
    values = new Stack<>();
    mins = new Stack<>();
  }

  public void push(int x) {
    if (x <= getMin()) {
      mins.push(x);
    }
    values.push(x);
  }

  public void pop() {
    int value = values.pop();
    if (value == getMin()) {
      mins.pop();
    }
  }

  public int top() {
    int value = values.peek();
    return value;
  }

  public int getMin() {
    if (mins.isEmpty()) {
      return Integer.MAX_VALUE;
    } else {
      return mins.peek();
    }
  }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */