package book;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

public class TreeListOfDepths {

  /**
   * Returns an ArrayList of LinkedLists representing levels of Tree.
   * Each level's values are stored in ne same LinkedList.
   * Uses recursive approach.
   * @param node binary tree
   * @return
   */
  public ArrayList<LinkedList<Integer>> getList(TreeNode node) {
    ArrayList levels = new ArrayList();
    generateLevels(levels, node, 0);
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

}
