package Top_K_Frequent_Elements_347;

import java.util.*;

/*
Given a non-empty array of integers, return the k most frequent elements.

Example 1:
Input: nums = [1,1,1,2,2,3], k = 2
Output: [1,2]

Example 2:
Input: nums = [1], k = 1
Output: [1]

Note:
You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
Your algorithm's time complexity must be better than O(n log n), where n is the array's size.
 */

public class Solution {
  public List<Integer> topKFrequent(int[] nums, int k) {

    if (nums == null) return null;
    if (nums.length < k) return null;

    HashMap<Integer, Integer> map = new HashMap<>();

    // build the map of frequency
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    // build an ArrayList of frequency
    List<NumData> list = new ArrayList<>();

    for (int key : map.keySet()) {
      list.add(new NumData(key, map.get(key)));
    }

    // Sort the array
    list.sort((NumData o1, NumData o2) -> {
      return o2.f - o1.f;
    });

    // Return K elements
    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < k; i++) {
      ans.add(list.get(i).val);
    }

    return ans;
  }

  private class NumData{
    int val;
    int f;

    public NumData(int x, int f) {
      this.val = x;
      this.f = f;
    }
  }

  /* ============================= */

//  public List<Integer> topKFrequentTreeMap(int[] nums, int k) {
//
//    if (nums == null) return null;
//
//    // Build the map of frequency
//    HashMap<Integer, Integer> map = new HashMap<>();
//    for (int n : nums) {
//      map.put(n, map.getOrDefault(n, 0) + 1);
//    }
//
//    // Generate the TreeMap with frequency
//    TreeMap<Integer, Integer> treeMap = new TreeMap<>(Comparator.reverseOrder());
//    for (int n : map.keySet()) {
//      treeMap.put(map.get(n), n);
//    }
//
//    // Return K elements
//    List<Integer> ans = new ArrayList<>();
//    while (ans.size() < k) {
//      ans.add(treeMap.pollFirstEntry().getValue());
//    }

//    // TODO: store values as List so that entries with same frequency do not get overwritten
//
//    return ans;
//  }

  /* ============================= */

  public List<Integer> topKFrequentHeap(int[] nums, int k) {

    if (nums == null) return null;

    HashMap<Integer, Integer> map = new HashMap<>();

    // build the map of frequency
    for (int n : nums) {
      map.put(n, map.getOrDefault(n, 0) + 1);
    }

    // Build a heap of frequency
    PriorityQueue<NumData> heap = new PriorityQueue<>((a,b) -> b.f - a.f);
    for (int i : map.keySet()) {
      heap.add(new NumData(i, map.get(i)));
    }

    // Build a List with answers
    List<Integer> ans = new ArrayList<>();
    while (ans.size() < k) {
      ans.add(heap.poll().val);
    }

    return ans;

  }

}
