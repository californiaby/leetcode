package Permutations_II_47;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

  public List<List<Integer>> permuteUnique(int[] nums) {

    // Sort the array so that it's easier to track duplicate values
    Arrays.sort(nums);

    List<List<Integer>> ans = new ArrayList<>();
    boolean[] used = new boolean[nums.length];
    backtrack(ans, new ArrayList<>(), used, nums);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, List<Integer> temp, boolean[] used, int[] nums) {
    // Check if temp is big enough
    if (temp.size() == nums.length) {
      ans.add(new ArrayList(temp));
    } else {
      // Iterate through the array
      for (int i = 0; i < nums.length; i++) {

        // Ignore digits that have been already consumed
        if (used[i]) continue;

        // Ignore duplicates that have previous skipped (i.e. not used)
        if (i > 0 && nums[i] == nums[i-1] && !used[i-1]) continue;

        // Add the item to the temp list and mark as used
        temp.add(nums[i]);
        used[i] = true;

        // Run recursively
        backtrack(ans, temp, used, nums);

        // Once done with recursion - remove the last item from the list and unmark as used
        temp.remove(temp.size()-1);
        used[i] = false;
      }
    }
  }

}
