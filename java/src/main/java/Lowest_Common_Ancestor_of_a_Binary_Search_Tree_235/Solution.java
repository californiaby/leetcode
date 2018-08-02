package Lowest_Common_Ancestor_of_a_Binary_Search_Tree_235;

import utils.TreeNode;

public class Solution {

  // if TreeNode structure has a pointer to parent node - simply traverse up until pointers meet
  // otherwise
  // recursive traverse down from the root
  // use definition of a BST - LCA will have the value between p and q (as LCA is parent root for branches with p and q)

  public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {

    if (root == null) return null;

    // switch p and q if they are not ordered
    if (p.val > q.val) {
      TreeNode temp = p;
      p = q;
      q = temp;
    }

    if (root.val >= p.val && root.val <= q.val) {

      // current value is between p and q - bingo!
      return root;

    } else if (root.val > q.val) {

      // check left branch
      return lowestCommonAncestor(root.left, p, q);

    } else {

      // check right branch
      return lowestCommonAncestor(root.right, p, q);

    }

  }
}
