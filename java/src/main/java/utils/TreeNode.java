package utils;

public class TreeNode {
  public int val;
  public TreeNode left;
  public TreeNode right;

  public TreeNode (int x) {
    val = x;
  }

  public TreeNode addLeft(int x) {
    left = new TreeNode(x);
    return this;
  }

  public TreeNode addRight(int x) {
    right = new TreeNode(x);
    return this;
  }

  public String toString() {
    return String.valueOf(val);
  }

  public boolean equals(TreeNode x) {
    TreeNode n = this;

    if (n == null && x == null) {
      return true;
    } else if (n == null || x == null) {
      return false;
    } else if (n.val != x.val) {
      return false;
    }

    return (n.left.equals(x.left) && n.right.equals(x.right));
  }

}
