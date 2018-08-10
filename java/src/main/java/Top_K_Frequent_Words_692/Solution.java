package Top_K_Frequent_Words_692;

import java.util.*;

/*
Given a non-empty list of words, return the k most frequent elements.

Your answer should be sorted by frequency from highest to lowest. If two words have the same frequency, then the word with the lower alphabetical order comes first.

Example 1:
Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
Output: ["i", "love"]
Explanation: "i" and "love" are the two most frequent words.
    Note that "i" comes before "love" due to a lower alphabetical order.
 */

public class Solution {
  public List<String> topKFrequent(String[] words, int k) {
    // Build frequency map
    HashMap<String, Integer> map = new HashMap<>();
    for (String s : words) {
      map.put(s, map.getOrDefault(s, 0) + 1);
    }

    // Create heap sorted by frequency
    PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>((a, b) -> {
      return (b.getValue() - a.getValue() == 0) ? a.getKey().compareTo(b.getKey()) : b.getValue() - a.getValue();
    });

    // Add values to heap
    for (Map.Entry<String, Integer> word : map.entrySet()) {
      heap.add(word);
    }

    // Generate the list with answer
    List<String> ans = new ArrayList<>();
    while (ans.size() < k) {
      ans.add(heap.poll().getKey());
    }

    return ans;
  }
}
