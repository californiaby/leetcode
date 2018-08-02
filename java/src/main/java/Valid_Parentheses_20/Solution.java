package Valid_Parentheses_20;

/*
Given a string containing just the characters '(', ')', '{', '}', '[' and ']',
determine if the input string is valid.

An input string is valid if:

Open brackets must be closed by the same type of brackets.
Open brackets must be closed in the correct order.
Note that an empty string is also considered valid.
 */

import java.util.Stack;

public class Solution {

  public boolean isValid(String s) {

    if (s.length() == 0) return true;

    Stack<Character> stack = new Stack<>();

    // we can use stack to store values
    // we can also add "inverted" value to stack to make comparison simpler

    for (char c : s.toCharArray()) {

      // if "opening" char - add corresponding "closing" to the stack
      // otherwise - pop top and compare to current
      if (c == '(') {
        stack.push(')');
      } else if (c == '{') {
        stack.push('}');
      } else if (c == '[') {
        stack.push(']');
      } else if (stack.isEmpty() || stack.pop() != c) {
        return false;
      }
    }
    return stack.isEmpty();
  }

}
