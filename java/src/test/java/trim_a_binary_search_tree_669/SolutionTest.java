package trim_a_binary_search_tree_669;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void trim() {
    TreeNode tree = new TreeNode(30)
            .addLeft(15)
            .addRight(45);
    tree.left.addLeft(10).addRight(18);
    tree.left.left.addLeft(8).addRight(12);
    tree.left.left.right.addRight(14);
    tree.left.left.right.right.addLeft(13);
    tree.right.addLeft(35).addRight(55);

    TreeNode test = solution.trimBST(tree, 13, 36);
  }
}