package min_stack_155;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MinStackTest {

  @Test
  public void test() {
    MinStack minStack = new MinStack();

    minStack.push(1);
    minStack.push(3);
    minStack.push(-1);
    minStack.push(5);

    assertEquals(5, minStack.top());
    assertEquals(-1, minStack.getMin());

    minStack.pop();

    assertEquals(-1, minStack.top());
    assertEquals(-1, minStack.getMin());

    minStack.pop();

    assertEquals(3, minStack.top());
    assertEquals(1, minStack.getMin());
  }


}