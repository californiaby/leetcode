package Partition_Labels_763;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
A string S of lowercase letters is given. We want to partition this string into as many parts as possible so that
each letter appears in at most one part, and return a list of integers representing the size of these parts.
Input: S = "ababcbacadefegdehijhklij"
Output: [9,7,8]
 */

public class Solution {

  /*
  Example: "ababcdeed". For char 'a' the shortest part is ending with the last occurrence of char - i.e. "aba"
  After that, the part length is extended for each char within the part, that last last occurrence after 'a': "abab".

  1. Iterate through array. For each letter - store the last position int[26] or HashMap.
  2. Use two pointers. Store the beginning of the part and update end for each processed char.
  3. Once interator == end - that's the part!
   */

  public List<Integer> partitionLabels(String S) {
    List<Integer> ans = new ArrayList<>();
    int[] last = new int[26];

    for (int i = 0; i < S.length(); i++) {
      int index = S.charAt(i) - 'a';
      last[index] = i;
    }

    int start = 0;
    int end = 0;

    for (int i = 0; i < S.length(); i++) {
      int index = S.charAt(i) - 'a';
      end = Math.max(end, last[index]);

      if (end == i) {
        ans.add(end - start + 1);
        start = i + 1;
      }
    }

    return ans;
  }
}
