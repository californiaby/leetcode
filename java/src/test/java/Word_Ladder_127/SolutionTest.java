package Word_Ladder_127;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void ladderLength() {
    String start = "babba";
    String end = "darbo";
    List<String> list = Arrays.asList("babbo", "bubbo", "dubbo", "durbo", "barba", "darba");

    assertEquals(4, solution.ladderLength(start, end, list));
  }

  @Test
  public void leet() {
    String start = "hit";
    String end = "cog";
    List<String> list = Arrays.asList("hot","dot","dog","lot","log");

    assertEquals(5, solution.ladderLength(start, end, list));
  }
}