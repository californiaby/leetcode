package book;

import utils.TreeNode;

/**
 * Find the 'next' node i.e. in-order successor of a given node in BST.
 * Assume that each node has a link to parent.
 */

public class TreeSuccessor {

  public TreeNode getSuccessor(TreeNode n) {

    if (n == null) return null;

    // if there's right branch - get the leftmost element of it
    if (n.right != null) {
      return leftmost(n.right);
    } else {
      TreeNode q = n;
      TreeNode x = q.parent;

      // Go up until we are on left instead of right
      while (x != null && x.left != q) {
        q = x;
        x = x = q.parent;
      }
      return x;
    }
  }

}
