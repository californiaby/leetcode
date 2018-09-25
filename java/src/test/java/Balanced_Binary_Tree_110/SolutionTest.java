package Balanced_Binary_Tree_110;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void isBalanced() {
    TreeNode root = new TreeNode(1);
    root.addLeft(2);
    root.left.addLeft(3);
    root.left.addRight(3);
    root.left.left.addLeft(4);
    root.addRight(2);

    assertFalse(solution.isBalanced(root));
  }
}