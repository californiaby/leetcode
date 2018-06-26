package move_zeroes_283;

public class Solution {
  /*
  Given an array nums, write a function to move all 0's to the end of it while maintaining the
  relative order of the non-zero elements.
  Input: [0,1,0,3,12]
  Output: [1,3,12,0,0]
  - You must do this in-place without making a copy of the array.
  - Minimize the total number of operations.
   */

  public void moveZeroes(int[] nums) {

    if (nums == null || nums.length == 0) return;

    // we don't really need to "move" the zeroes - we just need to know their amount so that we can write them
    // we also need indeces so that non-zero elements are shifted
    int insertPos = 0;

    // iterate, if current num != 0 - insert into pointed position, amd increment pointer
    for (int num: nums) {
      if (num != 0) nums[insertPos++] = num;
    }

    // fill the remaining part of the array with zeroes
    while (insertPos < nums.length) {
      nums[insertPos++] = 0;
    }
  }

}
