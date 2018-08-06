package amz;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class TwoElementsClosestToTargetTest {

  TwoElementsClosestToTarget solution = new TwoElementsClosestToTarget();

  @Test
  public void getOptimalIds() {
    int capacity = 20;
    List<List<Integer>> foreground = new ArrayList<>();
    foreground.add(Arrays.asList(1, 5));
    foreground.add(Arrays.asList(2, 1));
    foreground.add(Arrays.asList(3, 18));
    foreground.add(Arrays.asList(4, 12));
    foreground.add(Arrays.asList(5, 7));

    List<List<Integer>> background = new ArrayList<>();
    background.add(Arrays.asList(1, 10));
    background.add(Arrays.asList(2, 8));
    background.add(Arrays.asList(3, 17));

    List<Integer> exp = Arrays.asList(4, 2);

    assertEquals(exp, solution.getOptimalIds(capacity, foreground, background));
  }

  @Test
  public void get_null() {
    int capacity = 20;

    assertEquals(null, solution.getOptimalIds(capacity, null, null));
  }

  @Test
  public void getEmptyLists() {
    int capacity = 20;
    List<List<Integer>> foreground = new ArrayList<>();
    List<List<Integer>> background = new ArrayList<>();

    List<Integer> exp = new ArrayList<>();

    assertEquals(exp, solution.getOptimalIds(capacity, foreground, background));
  }

  @Test
  public void getEmptyForeground() {
    int capacity = 20;
    List<List<Integer>> foreground = new ArrayList<>();
    List<List<Integer>> background = new ArrayList<>();
    background.add(Arrays.asList(1, 10));
    background.add(Arrays.asList(2, 8));
    background.add(Arrays.asList(3, 17));

    List<Integer> exp = new ArrayList<>();

    assertEquals(exp, solution.getOptimalIds(capacity, foreground, background));
  }

  @Test
  public void getEmptyBackground() {
    int capacity = 20;
    List<List<Integer>> foreground = new ArrayList<>();
    foreground.add(Arrays.asList(1, 5));
    foreground.add(Arrays.asList(2, 1));
    foreground.add(Arrays.asList(3, 18));
    foreground.add(Arrays.asList(4, 12));
    foreground.add(Arrays.asList(5, 7));

    List<List<Integer>> background = new ArrayList<>();

    List<Integer> exp = new ArrayList<>();

    assertEquals(exp, solution.getOptimalIds(capacity, foreground, background));
  }

  @Test
  public void get_noMatchingValues() {
    int capacity = 10;
    List<List<Integer>> foreground = new ArrayList<>();
    foreground.add(Arrays.asList(1, 5));

    List<List<Integer>> background = new ArrayList<>();
    background.add(Arrays.asList(1, 7));

    List<Integer> exp = new ArrayList<>();

    assertEquals(exp, solution.getOptimalIds(capacity, foreground, background));
  }
}