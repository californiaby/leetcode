package Find_Duplicate_Subtrees_652;

import org.junit.Test;
import utils.TreeNode;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void findDuplicateSubtrees() {
    TreeNode root = new TreeNode(1);
    root.addLeft(2);
    root.left.addLeft(3);
    root.addRight(4);
    root.right.addLeft(2);
    root.right.left.addLeft(3);

    List<TreeNode> ans = Arrays.asList(root.left.left, root.left);

    assertEquals(ans, solution.findDuplicateSubtrees(root));
  }
}