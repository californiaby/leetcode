package ThreeSum_15;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void threeSum() {
    int[] arr = new int[] {-1, 0, 1, 2, -1, -4, 2};
    List<List<Integer>> list = new ArrayList<>();

    list.add(Arrays.asList(-4, 2, 2));
    list.add(Arrays.asList(-1, 0, 1));


    assertEquals(list, solution.threeSum(arr));
  }

  @Test
  public void leet() {
    int[] arr = new int[] {-1, 0, 1, 2, -1, -4};
    List<List<Integer>> list = new ArrayList<>();

    list.add(Arrays.asList(-1, -1, 2));
    list.add(Arrays.asList(-1, 0, 1));


    assertEquals(list, solution.threeSum(arr));
  }

  @Test
  public void leet_zero() {
    int[] arr = new int[] {0, 0, 0};
    List<List<Integer>> list = new ArrayList<>();

    list.add(Arrays.asList(0, 0, 0));


    assertEquals(list, solution.threeSum(arr));
  }

  @Test
  public void leet_zero_four() {
    int[] arr = new int[] {0, 0, 0, 0};
    List<List<Integer>> list = new ArrayList<>();

    list.add(Arrays.asList(0, 0, 0));


    assertEquals(list, solution.threeSum(arr));
  }
}