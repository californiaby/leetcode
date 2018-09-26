package Longest_Univalue_Path_687;

import utils.TreeNode;

public class Solution {
  int ans;

  public int longestUnivaluePath(TreeNode root) {
    if (root == null) return 0;

    ans = 0;
    getLength(root, root.val);
    return ans;
  }

  private int getLength(TreeNode node, int val) {
    if (node == null) return 0;
    int left = getLength(node.left, node.val);
    int right = getLength(node.right, node.val);

    // Calc the path goin left-to-right through the node
    ans = Math.max(ans, left + right);

    // Return the length going up
    if (val == node.val) {
      return Math.max(left, right) + 1;
    } else {
      return 0;
    }
  }
}
