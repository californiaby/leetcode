package Diameter_of_Binary_Tree_543;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void diameterOfBinaryTree() {
    TreeNode root = new TreeNode(1);
    root.addLeft(2);
    root.addRight(3);
    root.left.addLeft(4);

    assertEquals(3, solution.diameterOfBinaryTree(root));
  }
}