package Longest_Univalue_Path_687;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void longestUnivaluePath() {
    TreeNode tree = new TreeNode(1);
    tree.addRight(5);
    tree.right.addRight(5);
    tree.addLeft(4);
    tree.left.addLeft(4);
    tree.left.addRight(4);

    assertEquals(2, solution.longestUnivaluePath(tree));
  }
}