package Maximum_Subarray_53;

/*
Given an integer array nums, find the contiguous subarray (containing at least one number)
which has the largest sum and return its sum.

Input: [-2,1,-3,4,-1,2,1,-5,4],
Output: 6
Explanation: [4,-1,2,1] has the largest sum = 6.
 */

public class Solution {

  /*
  Solution - needs to be continuous so we can't change to order
  1. Iterate through the array. Store the max Sum so far
  2. If current sum is < 0 we don't need to store it anymore - just rewrite with current value
  3. If current sum is > 0 - add current value
   */
  public int maxSubArray(int[] nums) {

    // -2 +1 -3 +4 -1 +2 +1 -5 +4
    int max = Integer.MIN_VALUE;
    int sum = 0;

    for (int num : nums) {

      // Update sum based on current value
      if (sum <= 0) {
        sum = num;
      } else {
        sum = sum + num;
      }

      // Update max if current sum is bigger
      if (sum > max) {
        max = sum;
      }
    }

    return max;
  }
}
