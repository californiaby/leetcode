package Lowest_Common_Ancestor_of_a_Binary_Tree_236;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void lowestCommonAncestor() {
    TreeNode tree = new TreeNode(1);
    tree.addLeft(2);
    tree.addRight(3);
    tree.left.addLeft(4);
    tree.left.addRight(5);
    tree.left.right.addLeft(6);

    TreeNode exp = tree.left;

    assertEquals(exp, solution.lowestCommonAncestor(tree, tree.left.left, tree.left.right.left));
  }
}