package two_sum_ii_sorted_167;

/*
Given an array of integers that is already sorted in ascending order,
find two numbers such that they add up to a specific target number.

The function twoSum should return indices of the two numbers such that
they add up to the target, where index1 must be less than index2.

Note:
- Your returned answers (both index1 and index2) are not zero-based.
- You may assume that each input would have exactly one solution and you
  may not use the same element twice.

 */

public class Solution {

  /**
   * Since it's sorted, the elements (min, max) will be on different edges of the array.
   * Instead of using HashMap, we can use two pointers, iterating from the beginning and the end.
   * If they overlap - there's no answer (not possible according to task)
   * @param numbers
   * @param target
   * @return
   */

  public int[] twoSum(int[] numbers, int target) {
    int start = 0;
    int end = numbers.length - 1;

    while (start < end) {
      int sum = numbers[start] + numbers[end];

      // compare to target
      if (sum == target) {
        return new int[] {start + 1, end + 1}; // inc by one due to indeces starting with 1
      } else if (sum < target) {
        start++;
      } else {
        end--;
      }
    }

    return null;
  }

}
