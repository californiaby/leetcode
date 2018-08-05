package Product_of_Array_Except_Self_238;

/*
Given an array nums of n integers where n > 1,  return an array output such that output[i] is equal to the
product of all the elements of nums except nums[i].

Input:  [1,2,3,4]
Output: [24,12,8,6]
Note: Please solve it without division and in O(n).
 */

public class Solution {

  public int[] productExceptSelf(int[] nums) {
    int[] result = new int[nums.length]
            ;
    for (int i = 0, tmp = 1; i < nums.length; i++) {
      result[i] = tmp;
      tmp *= nums[i];
    }

    for (int i = nums.length - 1, tmp = 1; i >= 0; i--) {
      result[i] *= tmp;
      tmp *= nums[i];
    }
    
    return result;
  }

}
