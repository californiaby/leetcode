package Validate_Binary_Search_Tree_98;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void isValidBST() {
    TreeNode node = new TreeNode(5);
    node.addLeft(2);
    node.left.addLeft(1);
    node.left.addRight(3);
    node.addRight(10);
    node.right.addRight(11);

    assertTrue(solution.isValidBST(node));
  }

  @Test
  public void nope() {
    TreeNode node = new TreeNode(5);
    node.addLeft(2);
    node.left.addLeft(1);
    node.left.addRight(3);
    node.addRight(10);
    node.right.addLeft(11);

    assertFalse(solution.isValidBST(node));
  }

  // [-2147483648,null,2147483647]

  @Test
  public void leet_overflow() {
    TreeNode node = new TreeNode(-2147483648);
    node.addRight(2147483647);

    assertTrue(solution.isValidBST(node));
  }
}