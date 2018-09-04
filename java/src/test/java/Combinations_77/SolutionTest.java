package Combinations_77;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void combine() {
    List<List<Integer>> ans = new ArrayList<>();

    ans.add(Arrays.asList(2,4));
    ans.add(Arrays.asList(3,4));
    ans.add(Arrays.asList(2,3));
    ans.add(Arrays.asList(1,2));
    ans.add(Arrays.asList(1,3));
    ans.add(Arrays.asList(1,4));

    assertEquals(ans, solution.combine(4, 2));
  }
}