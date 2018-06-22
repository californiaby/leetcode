package book;

import utils.TreeNode;

public class TreeCheckBST {

  public boolean checkBST(TreeNode tree) {
    return checkBST(tree, Integer.MIN_VALUE, Integer.MAX_VALUE);
  }

  private boolean checkBST(TreeNode n, int min, int max) {
    if (n == null) return true;
    if (n.val > min && n.val < max) {
      return (checkBST(n.left, min, n.val) && checkBST(n.right, n.val, max));
    } else {
      return false;
    }
  }

}
