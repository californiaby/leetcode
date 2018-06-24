package invert_binary_tree_226;

import utils.TreeNode;

/*

Invert a binary tree.
Input:

     4
   /   \
  2     7
 / \   / \
1   3 6   9
Output:

     4
   /   \
  7     2
 / \   / \
9   6 3   1

 */

public class Solution {

  public TreeNode invertTree(TreeNode root) {

    // check if it's the end of branch
    if (root == null) return null;

    // flip current node's children
    TreeNode temp = root.left;
    root.left = root.right;
    root.right = temp;

    // done with level - move deeper
    root.left = invertTree(root.left);
    root.right = invertTree(root.right);

    return root;
  }

}
