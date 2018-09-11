package Implement_Stack_using_Queues_225;

import java.util.LinkedList;
import java.util.Queue;

public class MyStack {
  Queue<Integer> q1;
  Queue<Integer> q2;
  int top;

  /** Initialize your data structure here. */
  public MyStack() {
    this.q1 = new LinkedList<>();
    this.q2 = new LinkedList<>();
    top = Integer.MAX_VALUE;
  }

  /** Push element x onto stack. */
  public void push(int x) {
    q1.add(x);
    top = x;
  }

  /** Removes the element on top of the stack and returns that element. */
  public int pop() {
    while(q1.size() > 1) {
      top = q1.poll();
      q2.add(top);
    }

    int val = q1.poll();

    Queue<Integer> temp = new LinkedList<>();
    q1 = q2;
    q2 = temp;

    return val;
  }

  /** Get the top element. */
  public int top() {
    return top;
  }

  /** Returns whether the stack is empty. */
  public boolean empty() {
    return q1.isEmpty();
  }
}
