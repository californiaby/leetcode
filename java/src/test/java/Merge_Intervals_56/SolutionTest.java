package Merge_Intervals_56;

import org.junit.Test;
import utils.Interval;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void merge() {
    List<Interval> list = new LinkedList<>();
    list.add(new Interval(1,3));
    list.add(new Interval(5,8));
    list.add(new Interval(0,4));
    list.add(new Interval(5,12));
    list.add(new Interval(11,13));

    List<Interval> ans = new LinkedList<>();
    ans.add(new Interval(0,4));
    ans.add(new Interval(5,12));
    ans.add(new Interval(11,13));

    assertEquals(ans, solution.merge(list));
  }

  @Test
  public void no_overlaps() {
    List<Interval> list = new LinkedList<>();
    list.add(new Interval(5,8));
    list.add(new Interval(1,3));


    List<Interval> ans = new LinkedList<>();
    ans.add(new Interval(1,3));
    ans.add(new Interval(5,8));

    assertEquals(ans, solution.merge(list));
  }
}