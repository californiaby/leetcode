package book;

import org.junit.Test;
import utils.TreeNode;

public class TreeMinimalBSTTest {

  TreeMinimalBST solution = new TreeMinimalBST();

  @Test
  public void createMinimalBST() {
    int[] arr = new int[] {2, 5, 8};
    TreeNode tree = new TreeNode(5);
    tree.addLeft(2);
    tree.addRight(8);

//    assertEquals(tree, solution.createMinimalBST(arr));
    boolean eq = solution.createMinimalBST(arr).equals(tree);
  }
}