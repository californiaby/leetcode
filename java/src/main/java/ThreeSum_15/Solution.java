package ThreeSum_15;

import java.util.*;

/*

Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0?
Find all unique triplets in the array which gives the sum of zero.

Note:
The solution set must not contain duplicate triplets.

Example:
Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]

 */

public class Solution {
  public List<List<Integer>> threeSum(int[] nums) {

    List<List<Integer>> list = new ArrayList<>();

    // Edge cases: null and too short
    if (nums == null || nums.length < 3) return list;

    /*
    Solution:
    1. Sort the array
    2. Iterate the array, for each number run the 2Sum algo
    3. Remove duplicates
     */

    int n = nums.length - 1;
    mergeSort(nums, 0, n);

    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] <= 0) {  // ignore non-negative values
        if (i > 0 && nums[i] != nums[i - 1] || i == 0) { // ignore duplicates (already processed)
          list.addAll(twoSum(nums, i));
        }
      }
    }

    return list;
  }

  /**
   * Sorts the array using merge sort algo. O(n log n) time complexity.
   * @param arr the array to be sorted
   * @param l   the pointer to the first element in sorted section of array
   * @param r   the pointer to the last element in sorted section of array
   */
  private void mergeSort(int[] arr, int l, int r) {
    /*
    1. Find the middle element
    2. Recursively run the method for left and right part
      - this means splitting the sorted part into 2 halves
      - until each half is not longer than 1 element
    3. After that - merge halves
     */

    if (l < r) {
      int m = (l + r) / 2;

      mergeSort(arr, l, m);
      mergeSort(arr, m + 1, r);

      merge(arr, l, m, r);
    }
  }

  /**
   * Merges two parts of array into sorted sequence.
   * @param arr array to be merged
   * @param l   pointer to the leftmost element
   * @param m   pointer to the middle element (rightmost element of left part)
   * @param r   pointer to the rightmost element
   */
  private void merge(int[] arr, int l, int m, int r) {
    /*
    1. Get sizes of left and right parts
    2. Create temp arrays to store values
    3. Iterate through temp arrays and replace values in the initial array 1-by-1
     */

    int n1 = m - l + 1;
    int n2 = r - m;

    int[] tempLeft = new int[n1];
    int[] tempRight = new int[n2];

    for (int i = 0; i < n1; i++) {
      tempLeft[i] = arr[l + i];
    }

    for (int i = 0; i < n2; i++) {
      tempRight[i] = arr[m + 1 + i];
    }

    // `for` loops above can be replaced with System.arraycopy():

    // System.arraycopy(arr, l, tempLeft, 0, n1);
    // System.arraycopy(arr, m + 1, tempRight, 0, n2);

    int a = 0;
    int b = 0;
    int i = l;

    while (a < n1 || b < n2) {
      // Get value of elements from tempLeft and tempRight for comparison
      int lVal = a < n1 ? tempLeft[a] : Integer.MAX_VALUE;
      int rVal = b < n2 ? tempRight[b] : Integer.MAX_VALUE;

      if (lVal < rVal) {
        arr[i] = lVal;
        a++;
      } else {
        arr[i] = rVal;
        b++;
      }
      i++;
    }
  }

  /**
   * Runs 2Sum algo for array starting with given element.
   * Looks for two elements with higher index, summation of which gives value == given element.
   * @param arr the array to be iterated
   * @param p   the pointer to a given element
   * @return    List with values, including the given element's value
   */
  private List<List<Integer>> twoSum (int[] arr, int p) {
    List<List<Integer>> list = new LinkedList<>();
    int target = arr[p];
    HashSet<Integer> set = new HashSet<>();

    for (int i = p + 1; i < arr.length; i++) {
      int diff = 0 - target - arr[i];

      if (set.contains(diff) && !set.contains(arr[i])) {
        List<Integer> oneList = new LinkedList<>();

        oneList.add(target);     // initial element's value
        oneList.add(diff);       // value that is already stored in set
        oneList.add(arr[i]);     // current element's value

        list.add(oneList);
      } else {
        set.add(arr[i]);
      }
    }

    return list;
  }
}
