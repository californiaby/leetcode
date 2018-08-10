package Sort_Characters_By_Frequency_451;

/*
Given a string, sort it in decreasing order based on the frequency of characters.

Input: "tree"
Output: "eert"

Explanation:
'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.
 */

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
  public String frequencySort(String s) {

    // Generate a map of frequency
    HashMap<Character, Integer> map = new HashMap();
    for (char c : s.toCharArray()) {
      map.put(c, map.getOrDefault(c, 0) +1 );
    }

    // Create a heap with characters and their frequency, sort in desc order
    PriorityQueue<Map.Entry<Character, Integer>> heap = new PriorityQueue<>((a,b) -> b.getValue() - a.getValue());
    heap.addAll(map.entrySet());

    // Use StringBuilder to generate a string
    StringBuilder sb = new StringBuilder();
    while (!heap.isEmpty()) {
      Map.Entry<Character, Integer> e = heap.poll();
      for (int i = 0; i < e.getValue(); i++) {
        sb.append(e.getKey());
      }
    }

    return sb.toString();
  }
}
