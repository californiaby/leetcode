package book;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class TreeCheckBSTTest {

  TreeCheckBST solution = new TreeCheckBST();

  @Test
  public void checkBST() {
    TreeNode tree = new TreeNode(5);
    tree.addLeft(3).addRight(8);
    tree.left.addLeft(1).addRight(4);
    tree.right.addLeft(7);

    assertTrue(solution.checkBST(tree));
  }
}