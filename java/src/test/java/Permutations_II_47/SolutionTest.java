package Permutations_II_47;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void permuteUnique() {
    int[] nums = new int[] {1,2,1};
    List<List<Integer>> ans = solution.permuteUnique(nums);
    List<List<Integer>> exp = new ArrayList<>();
    exp.add(Arrays.asList(1,1,2));
    exp.add(Arrays.asList(1,2,1));
    exp.add(Arrays.asList(2,1,1));

    assertEquals(exp, ans);
  }
}