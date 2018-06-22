package merge_two_binary_trees_617;

import utils.TreeNode;

public class Solution {

  public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {

    // iterate recursively
    // if both have value > sum and store in 1st
    // if one has value > store this value in 1st
    // if both null > end

    if (t1 == null) return t2;
    if (t2 == null) return t1;

    TreeNode t = new TreeNode(t1.val + t2.val);
    t.left = mergeTrees(t1.left, t2.left);
    t.right = mergeTrees(t1.right, t2.right);
    return t;
  }

}
