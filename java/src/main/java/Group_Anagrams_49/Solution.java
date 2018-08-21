package Group_Anagrams_49;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/*
Given an array of strings, group anagrams together.
Input: ["eat", "tea", "tan", "ate", "nat", "bat"],
Output:
[ ["ate","eat","tea"],
  ["nat","tan"],
  ["bat"] ]

Notes:
- lowercase latin only
 */

public class Solution {

  /*
  Solutions:
  1. sort each string and compare to processed - O (k * nlogn)
  2. analyze each string by mapping chars, compare to existing - O (k * n)
   */
  public List<List<String>> groupAnagrams(String[] strs) {

    List<List<String>> ans = new LinkedList<>();
    Map<String, List> map = new HashMap();
    if (strs == null || strs.length == 0) return ans;

    for (String word : strs) {

      // 1. Build map of chars
      int[] count = new int[26];
      for (char c : word.toCharArray()) count[c - 'a']++;

      // 2 Build string representation in format "a1t1e1"
      StringBuilder sb = new StringBuilder();
      for (int i = 0; i < 26; i++) {
        if (count[i] != 0) {
          sb.append((char) i);
          sb.append(count[i]);
        }
      }

      // 3. Add to existing list or create a new list
      String key = sb.toString();

      if (!map.containsKey(key)) map.put(key, new LinkedList<>());
      map.get(key).add(word);

    }

    for (String key : map.keySet()) {
      ans.add(map.get(key));
    }

    return ans;
  }
}
