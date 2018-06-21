package baseball_game_682;

import java.util.Stack;

/*
You're now a baseball game point recorder.

Given a list of strings, each string can be one of the 4 following types:

Integer (one round's score): Directly represents the number of points you get in this round.
"+" (one round's score): Represents that the points you get in this round are the sum of the last two valid round's points.
"D" (one round's score): Represents that the points you get in this round are the doubled data of the last valid round's points.
"C" (an operation, which isn't a round's score): Represents the last valid round's points you get were invalid and should be removed.
Each round's operation is permanent and could have an impact on the round before and the round after.

You need to return the sum of the points you could get in all the rounds.
 */

public class Solution {

  public int calPoints(String[] ops) {

    Stack<Integer> stack = new Stack<>();

    // generate stack
    for (String s : ops) {
      if (s == "+") {
        int top = stack.pop();
        int newTop = top + stack.peek();
        stack.push(top);
        stack.push(newTop);
      } else if (s == "C") {
        stack.pop();
      } else if (s == "D") {
        stack.push(2 * stack.peek());
      } else {
        int val = Integer.valueOf(s);
        stack.push(val);
      }
    }

    // go through stack and calculate answer
    int ans = 0;
    for (int score : stack) {
      ans += score;
    }

    return ans;
  }

}
