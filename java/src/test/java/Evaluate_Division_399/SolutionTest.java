package Evaluate_Division_399;

import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void calcEquation() {
    String[][] equations = new String[][] {{"a", "b"}, {"b", "c"}};
    double[] values = new double[] {2.0, 3.0};
    String[][] queries = new String[][] {{"a", "c"}, {"b", "a"}, {"a", "e"}, {"a", "a"}, {"x", "x"}};

    double[] exp = new double[] {6.0, 0.5, -1.0, 1.0, -1.0};

    assertArrayEquals(exp, solution.calcEquation(equations, values, queries), 0);
  }
}