package Find_All_Anagrams_in_a_String_438;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

/*
Given a string s and a non-empty string p, find all the start indices of p's anagrams in s.
Strings consists of lowercase English letters only and the length of both strings s and p will not be larger than 20,100.
The order of output does not matter.

Input:
s: "cbaebabacd" p: "abc"
Output:
[0, 6]

Explanation:
The substring with start index = 0 is "cba", which is an anagram of "abc".
The substring with start index = 6 is "bac", which is an anagram of "abc".
 */

public class Solution {
  public List<Integer> findAnagrams(String s, String p) {

    List<Integer> ans = new LinkedList<>();
    if (s == null || p == null || p.length() > s.length()) return ans;

    // Generate hashmap with frequencies of target characters
    HashMap<Character, Integer> map = new HashMap<>();
    for (char c : p.toCharArray()) map.put(c, map.getOrDefault(c, 0) + 1);

    // Use counter to store amount of _chars_ which were not fully consumed by window
    int counter = map.size();

    // Create pointers for iteration through the string
    int begin = 0;
    int end = 0;

    // Iterate through the string
    while (end < s.length()) {

      // First, we need to let the window grow.
      // We'll be updating the frequency map for each consumed character
      // We'll also update the counter when all instances of specific letter are consumed - so that we know when it's
      // ok to start moving the begin pointer
      // Map may have negative values when too many instances of same letter are consumed within the window
      char c = s.charAt(end);
      if (map.containsKey(c)) {
        map.put(c, map.get(c) - 1);             // update freq map
        if (map.get(c) == 0) counter--;         // update counter when all instances of char are consumed
      }
      end++;

      // Now we'll check of we should work on head of the window. It should be the case only if all chars are consumed
      while (counter == 0) {
        char headC = s.charAt(begin);
        if (map.containsKey(headC)) {
          map.put(headC, map.get(headC) + 1);
          if (map.get(headC) > 0) counter++;    // update counter if there are spare characters, move tail
        }

        if (end - begin == p.length()) {
          ans.add(begin);
        }

        begin++;

      }

    }

    return ans;
  }
}
