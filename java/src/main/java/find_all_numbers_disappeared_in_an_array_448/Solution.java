package find_all_numbers_disappeared_in_an_array_448;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<Integer> findDisappearedNumbers(int[] nums) {

    List<Integer> ans = new ArrayList<>();

    // as we cant use extra space, we'll be using the same array to track numbers that were seen
    // we don't want to modify the numbers and we know they are always positive
    // so the best way to track "seen" number i - is to negate the element with index [i]
    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1;
      if (nums[index] > 0) {
         nums[index] = -nums[index];
      }
    }

    // now iterate through array and check values. non-negatives will have indeces that we never saw
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] > 0) {
        ans.add(i + 1);
      }
    }

    return ans;
  }

}
