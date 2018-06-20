package remove_element_27;

/*
Given an array nums and a value val, remove all instances of that value in-place and return the new length.
Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.
The order of elements can be changed. It doesn't matter what you leave beyond the new length.
 */

public class Solution {

  public int removeElement(int[] nums, int val) {
    if (nums == null || nums.length == 0 ) return 0;
    int write = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] != val) {
        nums[write] = nums[i];
        write++;
      }
    }
    return write;
  }

}
