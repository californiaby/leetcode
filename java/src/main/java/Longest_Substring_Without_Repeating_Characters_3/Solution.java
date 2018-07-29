package Longest_Substring_Without_Repeating_Characters_3;

import java.util.HashMap;

public class Solution {

  public int lengthOfLongestSubstring(String s) {

    HashMap<Character, Integer> map = new HashMap<>();
    int ans = 0;

    for (int i = 0, j = 0; j < s.length(); j++) {

      // check if char is already in the map; update i pointer to max of current position and char's location
      if (map.containsKey(s.charAt(j))) {
        i = Math.max(i, map.get(s.charAt(j)));
      }
      ans = Math.max(ans, j - i + 1);
      map.put(s.charAt(j), j + 1);
    }

    return ans;
  }

}
