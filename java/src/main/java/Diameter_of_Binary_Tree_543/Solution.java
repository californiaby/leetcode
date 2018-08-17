package Diameter_of_Binary_Tree_543;

import utils.TreeNode;

/*
Given a binary tree, you need to compute the length of the diameter of the tree.
The diameter of a binary tree is the length of the longest path between any two nodes in a tree.
This path may or may not pass through the root.

Example:
Given a binary tree
          1
         / \
        2   3
       / \
      4   5
Return 3, which is the length of the path [4,2,1,3] or [5,2,1,3].

Note: The length of path between two nodes is represented by the number of edges between them.
 */

public class Solution {

  int max = 0;

  public int diameterOfBinaryTree(TreeNode root) {
    if (root == null) return 0;
    maxDepth(root);
    return max;
  }

  /** Calculates maxDepth for children and updates max if necessary.
   *
   * @param root
   * @return
   */
  private int maxDepth(TreeNode root) {
    if (root == null) return 0;

    int left = maxDepth(root.left);
    int right = maxDepth(root.right);

    max = Math.max(max, left + right);      // update max if going through current node is the best option so far

    return Math.max(left, right) + 1;
  }
}
