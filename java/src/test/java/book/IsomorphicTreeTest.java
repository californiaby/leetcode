package book;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class IsomorphicTreeTest {

  IsomorphicTree solution = new IsomorphicTree();

  @Test
  public void isTrue() {
    TreeNode a = new TreeNode(1);
    a.addLeft(2);
    a.left.addLeft(4);
    a.addRight(3);
    a.right.addLeft(5);
    a.right.left.addLeft(7);
    a.right.left.addRight(6);

    TreeNode b = new TreeNode(1);
    b.addRight(2);
    b.right.addLeft(4);
    b.addLeft(3);
    b.left.addRight(5);
    b.left.right.addLeft(6);
    b.left.right.addRight(7);

    assertTrue(solution.isTrue(a, b));
  }
}