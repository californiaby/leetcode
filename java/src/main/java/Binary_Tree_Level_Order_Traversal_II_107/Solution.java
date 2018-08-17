package Binary_Tree_Level_Order_Traversal_II_107;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {
  public List<List<Integer>> levelOrderBottom(TreeNode root) {
    return doDFS(root);
  }

  /**
   * Generates bottom up list using BFS approach.
   * Uses Queue to store list of nodes that will be traversed on the next level.
   * While parsing current level, generates a list which will be added to 0 position of array list.
   * @param root
   * @return
   */
  private List<List<Integer>> doBFS(TreeNode root) {

    // Add first item to the queue
    List<List<Integer>> ans = new ArrayList<>();
    if (root == null) return ans;
    Queue<TreeNode> q = new LinkedList<>();
    q.add(root);

    // Iterate while queue is not empty
    while (q.size() > 0) {

      // Generate a list for current nodes in queue - representing level
      List<Integer> list = new LinkedList<>();
      int size = q.size();

      // Poll each node from queue and add to list. Also, add children to the queue
      for (int i = 0; i < size; i++) {
        TreeNode node = q.poll();
        list.add(node.val);

        if (node.left != null) q.add(node.left);
        if (node.right != null) q.add(node.right);
      }

      // Insert node in 0 position
      ans.add(0, list);

    }

    return ans;
  }

  /**
   * Generates bottom up list using DFS approach.
   * @param root
   * @return
   */
  private List<List<Integer>> doDFS(TreeNode root) {
    List<List<Integer>> levels = new ArrayList<>();
    doDFSMagic(levels, root, 0);
    return levels;
  }

  private void doDFSMagic(List<List<Integer>> levels, TreeNode root, int level) {
    if (root == null) return;

    // Generate an empty list and insert in 0 position if currently levels List isn't long enough
    if (level >= levels.size()) {
      List<Integer> list = new LinkedList<>();
      levels.add(0, list);
    }

    // Run recursively for children
    doDFSMagic(levels, root.left, level+1);
    doDFSMagic(levels, root.right, level+1);

    // Now it's executed in reverse order starting from the end - pull the desired level and populate
    levels.get(levels.size() - 1 - level).add(root.val);
  }

}
