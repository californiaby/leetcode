package maximum_depth_of_binary_tree_104;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void maxDepth() {
    TreeNode tree = new TreeNode(1).addLeft(2).addRight(3);
    tree.left.addLeft(4);

    assertEquals(3, solution.maxDepth(tree));
  }
}