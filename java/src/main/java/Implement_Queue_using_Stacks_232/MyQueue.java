package Implement_Queue_using_Stacks_232;

import java.util.Stack;

public class MyQueue {
  Stack<Integer> s1;
  Stack<Integer> s2;

  /** Initialize your data structure here. */
  public MyQueue() {
    this.s1 = new Stack<>();
    this.s2 = new Stack<>();
  }

  /** Push element x to the back of queue. */
  public void push(int x) {
    s1.push(x);
  }

  /** Removes the element from in front of queue and returns that element. */
  public int pop() {
    if (!s2.isEmpty()) {
      // s2 contains elements in reverse order (oldest on top) - poll from it
      return s2.pop();
    } else {
      // copy s1 to s2 in reverse order
      copyData(s1, s2);
      return s2.pop();
    }
  }

  /** Get the front element. */
  public int peek() {
    if (s2.isEmpty()) {
      // No data in s2, so oldest element is on the bottom of s1. Copy s1 -> s2
      copyData(s1, s2);
    }
    return s2.peek();
  }

  /** Returns whether the queue is empty. */
  public boolean empty() {
    return (s1.isEmpty() && s2.isEmpty());
  }

  /** Copy data from one stack to another. */
  private void copyData(Stack<Integer> fromStack, Stack<Integer> toStack) {
    while (!fromStack.isEmpty()) {
      toStack.push(fromStack.pop());
    }
  }
}
