package merge_two_binary_trees_617;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void merge() {
    TreeNode t1 = new TreeNode(1).addLeft(5);
    TreeNode t2 = new TreeNode(3).addLeft(6).addRight(9);
    TreeNode ans = solution.mergeTrees(t1, t2);
    TreeNode exp = new TreeNode(4).addLeft(11).addRight(9);

    assertEquals(exp, ans);
  }
}