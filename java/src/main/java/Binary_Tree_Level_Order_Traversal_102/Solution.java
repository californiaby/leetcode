package Binary_Tree_Level_Order_Traversal_102;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Solution {

  /**
   * Returns an ArrayList of LinkedLists representing levels of Tree.
   * Each level's values are stored in ne same LinkedList.
   * Uses recursive approach.
   * @param node binary tree
   * @return
   */
  public List<List<Integer>> levelOrder(TreeNode root) {
    ArrayList levels = new ArrayList();
    generateLevels(levels, root, 0);
    return levels;
  }

  private void generateLevels(ArrayList<LinkedList<Integer>> arr, TreeNode n, int level) {
    // check that node isn't null
    if (n != null) {
      int val = n.val;

      // check if linked list already exists at expected level
      if (arr.size() <= level) {

        // doesn't exist - create new linked list and add to ArrayList
        LinkedList ll = new LinkedList();
        ll.add(val);
        arr.add(level, ll);

      } else {

        // linked list exists - modify
        LinkedList ll = arr.get(level);
        ll.add(val);
      }
      generateLevels(arr, n.left, level + 1);
      generateLevels(arr, n.right, level + 1);
    }
  }

  // TODO implement a solution with queue

}
