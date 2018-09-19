package Combination_Sum_II_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum2(int[] candidates, int target) {
    Arrays.sort(candidates);
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(ans, new ArrayList<>(), candidates, target, 0);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, List<Integer> temp, int[] candidates, int remain, int start) {
    if (remain < 0) return;
    if (remain == 0) ans.add(new ArrayList<>(temp));
    if (remain > 0) {
      for (int i = start; i < candidates.length; i++) {
        if (i > start && candidates[i] == candidates[i-1]) continue;
        temp.add(candidates[i]);
        backtrack(ans, temp, candidates, remain-candidates[i], i+1);
        temp.remove(temp.size()-1);
      }
    }
  }
}
