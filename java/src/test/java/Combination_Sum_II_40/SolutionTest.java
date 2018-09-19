package Combination_Sum_II_40;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void combinationSum2() {
    int[] arr = new int[] {10,1,2,7,6,1,5};
    int target = 8;

    List<List<Integer>> ans = solution.combinationSum2(arr, target);
  }
}