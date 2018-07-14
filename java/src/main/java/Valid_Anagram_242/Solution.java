package Valid_Anagram_242;

/*
Given two strings s and t , write a function to determine if t is an anagram of s.
 */

import java.util.HashMap;

public class Solution {

  /**
   * If one string is anagram of another, it means they have same set of characters.
   * Iterate through first, store HashMap of letters with counter.
   * Iterate through second, for each match reduce counter.
   * if set.size() == 0 return true
   * @param s
   * @param t
   * @return
   */
  public boolean isAnagram(String s, String t) {

    HashMap<Character, Integer> map = new HashMap();

    for (char c : s.toCharArray()) {
      int count = map.containsKey(c) ? map.get(c) : 0;
      map.put(c, count + 1);
    }

    for (char c : t.toCharArray()) {
      if (!map.containsKey(c)) {
        return false;
      } else {
        int count = map.get(c);
        if (count == 1) {
          map.remove(c);
        } else {
          map.put(c, count - 1);
        }
      }
    }

    return map.size() == 0;
  }

}
