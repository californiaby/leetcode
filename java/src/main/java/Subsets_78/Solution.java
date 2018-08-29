package Subsets_78;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> subsets(int[] nums) {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> temp = new ArrayList<>();

    if (nums == null || nums.length == 0) return ans;

    generateSubsets(ans, temp, nums, 0);
    return ans;
  }

  private void generateSubsets(List<List<Integer>> ans, List<Integer> temp, int[] nums, int start) {
    // 1. Populate the ans on each run
    ans.add(new ArrayList<>(temp)); // Create a new list to store values, not the Object references

    // 2. Starting with position `start` iterate through the `nums`
    for (int current = start; current < nums.length; current++) {
      // 3. For each iteration add the number to the `temp` list (prefix)
      temp.add(nums[current]);

      // 4. And run recursively for the following numbers
      generateSubsets(ans, temp, nums, current + 1);

      // 5. We've finished recursive run for the last number so remove it and iterate to next
      temp.remove(temp.size() - 1);
    }
  }
}
