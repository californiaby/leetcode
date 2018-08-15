package Binary_Tree_Inorder_Traversal_94;

import org.junit.Test;
import utils.TreeNode;

import java.util.Arrays;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void inorderTraversal() {
    TreeNode a = new TreeNode(1);
    a.addLeft(1);
    a.addRight(3);
    a.left.addRight(6);
    a.right.addLeft(8);

    assertEquals(Arrays.asList(1,6,1,8,3), solution.inorderTraversal(a));
  }
}