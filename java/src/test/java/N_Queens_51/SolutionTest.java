package N_Queens_51;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void solveNQueens() {
    List<List<String>> exp = new ArrayList<>();
    List<String> sol1 = Arrays.asList(".Q..","...Q","Q...","..Q.");
    List<String> sol2 = Arrays.asList("..Q.","Q...","...Q",".Q..");

    exp.add(sol1);
    exp.add(sol2);

    assertEquals(exp, solution.solveNQueens(4));

  }
}