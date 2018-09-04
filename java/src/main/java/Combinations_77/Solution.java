package Combinations_77;

import java.util.ArrayList;
import java.util.List;

public class Solution {
  public List<List<Integer>> combine(int n, int k) {

    List<List<Integer>> ans = new ArrayList<>();
    if (n == 0 || k == 0) return ans;

    generateCombinations(ans, new ArrayList<Integer>(), 1, n, k);

    return ans;
  }

  //   1234
  //  1.xxx
  //  2..xx
  //  3...x
  //  4....

  private void generateCombinations (List<List<Integer>> ans, ArrayList<Integer> temp, int start, int max, int total) {

    if (temp.size() == total) {
      ans.add(new ArrayList<>(temp));
      return;
    }

    for (int current = start; current <= max; current++) {
      temp.add(current);
      generateCombinations(ans, temp, current + 1, max, total);
      temp.remove(temp.size() - 1);
    }

  }
}
