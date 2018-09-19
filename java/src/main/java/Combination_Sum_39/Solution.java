package Combination_Sum_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(ans, new ArrayList<Integer>(), candidates, target, 0);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remain, int start) {
    if (remain < 0) {
      return;
    } else if (remain == 0) {
      ans.add(new ArrayList<>(temp));
    } else {
      for (int i = start; i < candidates.length; i++) {
        temp.add(candidates[i]);
        backtrack(ans, temp, candidates, remain - candidates[i], i);
        temp.remove(temp.size()-1);
      }
    }
  }
}
