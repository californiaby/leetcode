package find_all_duplicates_in_an_array_442;

import java.util.ArrayList;
import java.util.List;

public class Solution {

  public List<Integer> findDuplicates(int[] nums) {

    List<Integer> ans = new ArrayList<>();

    for (int i = 0; i < nums.length; i++) {
      int index = Math.abs(nums[i]) - 1;
      if (nums[index] > 0) {
        nums[index] = -nums[index];
      } else {
        ans.add(Math.abs(index + 1));
      }
    }

    return ans;

  }

}
