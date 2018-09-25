package Balanced_Binary_Tree_110;

import utils.TreeNode;

public class Solution {
  public boolean isBalanced(TreeNode root) {
    return getDepth(root) != -1;
  }

  private int getDepth(TreeNode root) {
    if (root == null) {
      return 1;
    } else {
      int left = getDepth(root.left);
      int right = getDepth(root.right);
      if (left == -1 || right == -1 || Math.abs(left-right) > 1) return -1;
      return Math.max(left, right) + 1;
    }
  }
}
