package first_unique_character_in_string_387;

import java.util.HashMap;

public class Solution {

  public int firstUniqChar(String s) {

    HashMap <Character, Integer> map = new HashMap <Character, Integer> ();

    // Generate map of all characters
    for (char c : s.toCharArray()) {
      Integer n = map.get(c);
      map.put(c, n == null ? 1 : n + 1);
    }

    for (int i = 0; i < s.length(); i++) {
      if (map.get(s.charAt(i)) == 1) {
        return i;
      }
    }

    return -1;
  }

}
