package invert_binary_tree_226;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void invertTree() {

    TreeNode tree = new TreeNode(1).addLeft(2).addRight(3);
    tree.left.addLeft(4);

    TreeNode inv = new TreeNode(1).addLeft(3).addRight(2);
    tree.right.addRight(4);

    assertEquals(inv, solution.invertTree(tree));

  }
}