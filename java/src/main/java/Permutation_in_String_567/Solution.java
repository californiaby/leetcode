package Permutation_in_String_567;

/*
Given two strings s1 and s2, write a function to return true if s2 contains the permutation of s1.
In other words, one of the first string's permutations is the substring of the second string.

Example 1:
Input:s1 = "ab" s2 = "eidbaooo"
Output:True
Explanation: s2 contains one permutation of s1 ("ba").

Example 2:
Input:s1= "ab" s2 = "eidboaoo"
Output: False
 */

import java.util.HashMap;

public class Solution {
  public boolean checkInclusion(String s1, String s2) {

    if (s1.length() > s2.length()) return false;

    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : s1.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

    int begin = 0, end = 0;
    int counter = map.size();

    while (end < s2.length()) {

      char c = s2.charAt(end);

      // Move end until all characters of the map are consumed
      if (map.containsKey(c)) {
        map.put(c, map.get(c) - 1);
        if (map.get(c) == 0) counter--;
      }
      end++;

      // If all chars are consumed, move head until there are unused chars
      while (counter == 0) {
        char headC = s2.charAt(begin);
        if (map.containsKey(headC)) {
          map.put(headC, map.get(headC) + 1);
          if (map.get(headC) > 0) counter++;
        }

        if (end - begin == s1.length()) return true;

        begin++;
      }

    }

    return false;
  }

}
