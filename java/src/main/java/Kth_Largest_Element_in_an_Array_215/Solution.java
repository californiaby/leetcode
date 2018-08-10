package Kth_Largest_Element_in_an_Array_215;

/*
Find the kth largest element in an unsorted array.
Note that it is the kth largest element in the sorted order, not the kth distinct element.

Example 1:
Input: [3,2,1,5,6,4] and k = 2
Output: 5

Example 2:
Input: [3,2,3,1,2,4,5,5,6] and k = 4
Output: 4

Note: You may assume k is always valid, 1 ≤ k ≤ array's length.
 */

import java.util.PriorityQueue;

public class Solution {

  /*
  Solutions:
  1. Sort the array, and get the kth element - O(nlogn)
  2. Use heap to store the elements
   */

  public int findKthLargest(int[] nums, int k) {
    PriorityQueue<Integer> heap = new PriorityQueue<>((a,b) -> b - a);
    for (int num : nums) {
      heap.add(num);
    }

    int count = 0;
    int ans = -1;
    while (count < k) {
      ans = heap.poll();
      count++;
    }

    return ans;
  }
}
