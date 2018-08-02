package Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void lowestCommonAncestor() {
    TreeNode root = new TreeNode(5);
    root.left = new TreeNode(3);
    root.right = new TreeNode(7);
    root.left.left = new TreeNode(2);
    root.left.right = new TreeNode(4);

    assertEquals(root.left, solution.lowestCommonAncestor(root, root.left.left, root.left.right));
  }
}