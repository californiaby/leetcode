package Longest_Univalue_Path_687;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void longestUnivaluePath() {
    TreeNode tree = new TreeNode(1);
    tree.addLeft(1);
    tree.left.addLeft(1);
    tree.addRight(2);
    tree.right.addLeft(2);
    tree.right.addRight(2);
    tree.right.left.addRight(2);

    assertEquals(3, solution.longestUnivaluePath(tree));
  }
}