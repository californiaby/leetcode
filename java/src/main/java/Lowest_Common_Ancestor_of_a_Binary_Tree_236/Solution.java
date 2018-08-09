package Lowest_Common_Ancestor_of_a_Binary_Tree_236;

import utils.TreeNode;

public class Solution {
  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    // reached end of tree
    if (root == null) return null;

    // current node is one of desired - return this node
    if (root == p || root == q) return root;

    // if none of the above was triggered, check both kids
    TreeNode left = lowestCommonAncestor(root.left, p, q);
    TreeNode right = lowestCommonAncestor(root.right, p, q);

    // if both children are not null, each of desired nodes is in branch > current node is LCA
    if (left != null && right != null) return root;

    // if only one of the children isn't null - this is the branch where desired node exists, return it
    return (left != null) ? left : right;

  }
}
