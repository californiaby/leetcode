package Next_Closest_Time_681;

/*
Given a time represented in the format "HH:MM", form the next closest time by reusing the current digits.
There is no limit on how many times a digit can be reused.

You may assume the given input string is always valid. For example, "01:34", "12:09" are all valid.
"1:34", "12:9" are all invalid.
 */

import java.util.HashSet;

public class Solution {
  public String nextClosestTime(String time) {

    // Get integer value of hh and mm
    int hh = Integer.parseInt(time.substring(0, 2));
    int mm = Integer.parseInt(time.substring(3, 5));

    // Get integer value of current time
    int current = hh * 60 + mm;

    // Get set of allowed digits
    HashSet<Integer> set = new HashSet<>();

    for (char c : time.toCharArray()) {
      if (c != ':') set.add(c - '0');
    }

    int newTime = current + 1;

    while (newTime != current) {
      if (setContainsAllDigits(newTime, set)) {
        return generateStringFromTime(newTime);
      }

      newTime = (newTime >= 23 * 60 + 59) ? 0 : newTime + 1;
    }

    return generateStringFromTime(current);
  }

  private String generateStringFromTime(int time) {
    int h = time / 60;
    int m = time % 60;

    return String.format("%02d:%02d", h, m);
  }

  private boolean setContainsAllDigits(int time, HashSet<Integer> set) {
    int h = time / 60;
    int m = time % 60;

    return set.contains(h % 10) && set.contains(h / 10) && set.contains(m % 10) && set.contains(m / 10);
  }
}
