package Combination_Sum_III_216;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> combinationSum3(int k, int n) {
    List<List<Integer>> ans = new ArrayList<>();
    backtrack(ans, new ArrayList<Integer>(), 1, n, k);
    return ans;
  }

  private void backtrack(List<List<Integer>> ans, List<Integer> temp, int start, int target, int num) {
    if (temp.size() == num) {
      if (target == 0) {
        ans.add(new ArrayList(temp));
      } else {
        return;
      }
    } else {
      for (int i = start; i <= 9; i++) {
        temp.add(i);
        backtrack(ans, temp, i+1, target-i, num);
        temp.remove(temp.size()-1);
      }
    }
  }
}
