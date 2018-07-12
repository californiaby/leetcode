package Wiggle_Sort_280;

/*

Given an unsorted array nums, reorder it in-place such that nums[0] <= nums[1] >= nums[2] <= nums[3]....

Example:

Input: nums = [3,5,2,1,6,4]
Output: One possible answer is [3,5,1,6,2,4]

 */

public class Solution {

  public void wiggleSort(int[] nums) {

    // We can solve this in one pass
    // We need to check following elements applying switching logic (less / more)
    // If pair doesn't follow logic, we switch the element
    // Example:
    // 3 < 5 > 2 . 1 - current element is "2". It has passed previous check (smaller then five" meaning that we can
    // safely put any even smaller element in it's place
    // Now, when we check the next element (2 < 1) if it fails the check we can move it into place of "2"

    for (int i = 0; i < nums.length - 1; i++) {
      // i % 2 == 0 means that current element is even, so "less" logic applies

      if (i % 2 == 0) {
        if (nums[i] > nums[i+1]) {
          swap(nums, i, i+1);
        }
      } else {
        if (nums[i] < nums[i+1]) {
          swap(nums, i, i+1);
        }
      }
    }

  }

  private void swap(int[] nums, int i, int j) {
    int temp = nums[i];
    nums[i] = nums[j];
    nums[j] = temp;
  }

}
