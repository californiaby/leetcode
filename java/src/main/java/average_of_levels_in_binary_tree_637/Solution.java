package average_of_levels_in_binary_tree_637;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

  /**
   * Solution with queue
   * @param root
   * @return
   */
  public List<Double> averageOfLevels(TreeNode root) {

    List<Double> ans = new ArrayList<>();
    Queue<TreeNode> q = new LinkedList<>();

    if (root == null) return ans;
    q.add(root);

    // BFS via queue
    while (!q.isEmpty()) {
      int n = q.size();
      double sum = 0;
      for (int i = 0; i < n; i++) {
        TreeNode node = q.poll();
        sum += node.val;
        if (node.left != null) q.add(node.left);
        if (node.right != null) q.add(node.right);
      }
      ans.add(sum / n);
    }
    return ans;
  }

}
