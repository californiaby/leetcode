package Validate_Binary_Search_Tree_98;

import utils.TreeNode;

/*
Given a binary tree, determine if it is a valid binary search tree (BST).
Assume a BST is defined as follows:
- The left subtree of a node contains only nodes with keys less than the node's key.
- The right subtree of a node contains only nodes with keys greater than the node's key.
- Both the left and right subtrees must also be binary search trees.
 */

public class Solution {
  public boolean isValidBST(TreeNode root) {
    if (root == null) {
      return true;
    } else {
      return isValidBst(root.left, Long.MIN_VALUE, root.val) && isValidBst(root.right, root.val, Long.MAX_VALUE);
    }
  }

  /**
   * Verifies that tree is a valid BST, by comparing current value (and recursively branches) to boundaries.
   * @param node tree node
   * @param min minimal boundary - it's expected that all nodes of tree are > than this value
   * @param max maximal boundary - it's expected that all nodes of tree are < than this value
   * @return true | false
   */
  private boolean isValidBst(TreeNode node, long min, long max) {
    if (node == null) {
      return true;
    } else if (node.val <= min || node.val >= max) {
      return false;
    } else {
      return isValidBst(node.left, min, node.val) && isValidBst(node.right, node.val, max);
    }
  }
}
