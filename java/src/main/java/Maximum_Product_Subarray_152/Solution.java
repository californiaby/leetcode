package Maximum_Product_Subarray_152;

/*
Given an integer array nums, find the contiguous subarray within an array
(containing at least one number) which has the largest product.

Input: [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.
 */

public class Solution {
  public int maxProduct(int[] nums) {

    // Use imax and imin to store max and min value of subsequence ending in i'th element
    int imax = nums[0];
    int imin = nums[0];
    int ans = nums[0];

    for (int i = 1; i < nums.length; i++) {

      // Multiplication by negative value inverts max and min so we should swap them
      if (nums[i] < 0) {
        int temp = imin;
        imin = imax;
        imax = temp;
      }

      imax = Integer.max(nums[i], imax * nums[i]);
      imin = Integer.min(nums[i], imin * nums[i]);

      ans = Integer.max(ans, imax);
    }

    return ans;
  }
}
