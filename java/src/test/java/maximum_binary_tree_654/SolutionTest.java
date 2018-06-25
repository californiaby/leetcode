package maximum_binary_tree_654;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void constructMaximumBinaryTree() {

    int[] arr = new int[] {3,2,1,6,0,5};
    TreeNode ans = solution.constructMaximumBinaryTree(arr);
    assertEquals(5, ans);
  }
}