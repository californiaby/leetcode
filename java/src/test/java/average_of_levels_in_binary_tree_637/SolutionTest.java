package average_of_levels_in_binary_tree_637;

import org.junit.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void averageOfLevels() {
    TreeNode tree = new TreeNode(3).addLeft(1).addRight(7);
    tree.left.addLeft(6).addRight(9);
    tree.right.addRight(5);

    List<Double> ans = new ArrayList<>();
    ans.add(3.0);
    ans.add(4.0);
    ans.add(20.00/3);

    assertEquals(ans, solution.averageOfLevels(tree));
  }
}