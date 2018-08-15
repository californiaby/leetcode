package Subtree_of_Another_Tree_572;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void isSubtree() {
    TreeNode a = new TreeNode(0);
    a.addLeft(1);
    a.left.addRight(3);
    a.left.right.addLeft(4);

    TreeNode b = new TreeNode(1);
    b.addRight(3);
    b.right.addLeft(4);

    assertTrue(solution.isSubtree(a, b));
  }

  @Test
  public void bigger_missing() {
    TreeNode a = new TreeNode(0);
    a.addLeft(1);
    a.left.addRight(3);

    TreeNode b = new TreeNode(1);
    b.addRight(3);
    b.right.addLeft(4);

    assertFalse(solution.isSubtree(a, b));
  }

  @Test
  public void bigger_extra() {
    TreeNode a = new TreeNode(0);
    a.addLeft(1);
    a.left.addLeft(2);
    a.left.addRight(3);
    a.left.right.addLeft(4);

    TreeNode b = new TreeNode(1);
    b.addRight(3);
    b.right.addLeft(4);

    assertFalse(solution.isSubtree(a, b));
  }

  @Test
  public void different() {
    TreeNode a = new TreeNode(0);
    a.addLeft(1);
    a.addRight(2);

    TreeNode b = new TreeNode(3);
    b.addLeft(4);
    b.addRight(5);

    assertFalse(solution.isSubtree(a, b));
  }

  @Test
  public void ones() {
    TreeNode a = new TreeNode(1);
    a.addLeft(1);

    TreeNode b = new TreeNode(1);

    assertTrue(solution.isSubtree(a, b));
  }

  @Test
  public void leet_big_fail() {

    TreeNode a = new TreeNode(3);
    a.addLeft(4);
    a.addRight(5);
    a.left.addLeft(1);
    a.left.addRight(2);
    a.left.left.addLeft(0);

    TreeNode b = new TreeNode(4);
    b.addLeft(1);
    b.addRight(2);

    assertFalse(solution.isSubtree(a, b));
  }

  // [3,4,5,1,null,2]
  // [3,1,2]

  @Test
  public void leet_fail() {

    TreeNode a = new TreeNode(3);
    a.addLeft(4);
    a.addRight(5);
    a.left.addLeft(1);
    a.right.addLeft(2);

    TreeNode b = new TreeNode(3);
    b.addLeft(1);
    b.addRight(2);

    assertFalse(solution.isSubtree(a, b));
  }

}