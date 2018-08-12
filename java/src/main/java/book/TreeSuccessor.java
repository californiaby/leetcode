package book;

import apple.laf.JRSUIUtils;
import utils.TreeNode;

/**
 * Find the 'next' node i.e. in-order successor of a given node in BST.
 * Assume that each node has a link to parent.
 */

public class TreeSuccessor {

  public TreeNode getSuccessor(TreeNode n) {

    if (n == null) return null;

    // if there's a right branch - return leftmost node
    if (n.right != null) {
      return leftMost(n.right);
    } else {

      // get the parent which has the processed node on the left side
      TreeNode current = n;
      TreeNode parent = current.parent;

      while (parent != null && parent.left != current) {
        current = parent;
        parent = current.parent;
      }

      return parent;
    }
    
  }

}
