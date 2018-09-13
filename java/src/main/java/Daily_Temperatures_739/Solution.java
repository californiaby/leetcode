package Daily_Temperatures_739;

import java.util.Stack;

public class Solution {
  public int[] dailyTemperatures(int[] temperatures) {
    Stack<Integer> stack = new Stack<>();       // store indeces of days in stack
    int[] ans = new int[temperatures.length];

    // Iterate from the end
    for (int i = temperatures.length-1; i >= 0; i--) {
      int current = temperatures[i];

      // Compare to items in stack, pop while current is not colder than stored in stack
      while (!stack.isEmpty() && current >= temperatures[stack.peek()]) stack.pop();

      // Now it's either an empty stack (i.e. no warmer day) or next stack's item is warmer
      ans[i] = stack.isEmpty() ? 0 : stack.peek() - i;

      // Add current dqy's index to the stack
      stack.push(i);
    }

    return ans;
  }
}
