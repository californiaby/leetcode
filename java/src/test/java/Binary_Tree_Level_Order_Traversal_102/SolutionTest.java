package Binary_Tree_Level_Order_Traversal_102;

import org.junit.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void levelOrder() {
    TreeNode root = new TreeNode(1);
    root.left = new TreeNode(2);
    root.right = new TreeNode(3);
    root.left.left = new TreeNode(4);

    ArrayList list = new ArrayList();
    LinkedList one = new LinkedList(Arrays.asList(1));
    LinkedList two = new LinkedList(Arrays.asList(2, 3));
    LinkedList three = new LinkedList(Arrays.asList(4));

    list.add(one);
    list.add(two);
    list.add(three);

    assertEquals(list, solution.levelOrder(root));
  }
}