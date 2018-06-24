package sum_of_left_leaves_404;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void sumOfLeftLeaves() {
    TreeNode tree = new TreeNode(1).addLeft(2).addRight(3);
    tree.left.addLeft(4).addRight(5);

    assertEquals();
  }
}