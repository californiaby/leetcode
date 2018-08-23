package Rotate_Array_189;

/*
Given an array, rotate the array to the right by k steps, where k is non-negative.

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]

Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
 */

public class Solution {
  public void rotate(int[] nums, int k) {
//    rotateWithReverse(nums, k);
    rotateWithNewArray(nums, k);
  }

  /* ================================================================ */

  private void rotateWithReverse(int[] nums, int k) {
    k = nums.length % k;
    rotate(nums, 0, nums.length);
    rotate(nums, 0, k+1);
    rotate(nums, k+1, nums.length);
  }

  private void rotate(int[] nums, int start, int end) {
    while (start < end-1) {
      int temp = nums[start];
      nums[start] = nums[end-1];
      nums[end-1] = temp;
      start++;
      end--;
    }
  }

  /* ================================================================ */

  private void rotateWithNewArray(int[] nums, int k) {
    int[] newArr = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      int newIndex = (i + k) % nums.length;
      newArr[newIndex] = nums[i];
    }

    for (int i = 0; i < nums.length; i++) {
      nums[i] = newArr[i];
    }
  }

}
