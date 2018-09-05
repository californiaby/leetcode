package Minimum_Window_Substring_76;

import java.util.HashMap;

public class Solution {
  public String minWindow(String s, String t) {

    // b
    // ADOBECODEBANC
    // e

    // A -> 1, B -> 1, C -> 1
    // counter == 0

    // Generate map of frequencies
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : t.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) + 1);
    }

    // Store the shortest substring 'ans' and the value of currently tracked string
    String ans = "";
    int ansLen = Integer.MAX_VALUE;

    // Use counter to track how many chars have not been consumed yet
    int counter = map.size();
    int begin = 0;

    // Iterate through the string with an 'end' pointer
    for (int end = 0; end < s.length(); end++) {
      char c = s.charAt(end);

      // If map contains the key (i.e. it's desired char) - decrease the frequency
      if (map.containsKey(c)) {
        map.put(c, map.get(c) - 1);

        // If after this decrease the freq is == 0, reduce the counter (i.e. all instances of current char are consumed)
        if (map.get(c) == 0) counter--;
      }

      // If all chars are consumed - move the 'begin' pointer
      while (counter == 0 && begin <= end) {
        c = s.charAt(begin);

        // If current 'begin' char is one of desired - increase the frequency
        if (map.containsKey(c)) {
          map.put(c, map.get(c) + 1);

          // If freq counter is > 0, increase `counter` - i.e. substring doesn't contain all desired chars
          if (map.get(c) > 0) {
            counter++;
          }
        }

        // Get sub length and compare to the stored values
        int subLength = end + 1 - begin;
        if (subLength < ansLen) {
          ans = s.substring(begin, end + 1);
          ansLen = subLength;
        }

        // Move the begin pointer
        begin++;
      }

    }

    return ans;
  }
}
