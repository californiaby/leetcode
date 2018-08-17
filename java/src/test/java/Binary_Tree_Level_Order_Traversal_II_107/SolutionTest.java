package Binary_Tree_Level_Order_Traversal_II_107;

import org.junit.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void levelOrderBottom() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);

    ArrayList levels = new ArrayList<>();
    levels.add(Arrays.asList(4));
    levels.add(Arrays.asList(2, 3));
    levels.add(Arrays.asList(1));

    assertEquals(levels, solution.levelOrderBottom(root));
  }

  @Test
  public void leet() {
    TreeNode root = new TreeNode(3);
    root.left = new TreeNode(9);
    root.right = new TreeNode(20);
    root.right.left = new TreeNode(15);
    root.right.right = new TreeNode(7);

    ArrayList levels = new ArrayList<>();
    levels.add(Arrays.asList(15, 7));
    levels.add(Arrays.asList(9, 20));
    levels.add(Arrays.asList(3));

    assertEquals(levels, solution.levelOrderBottom(root));
  }
}