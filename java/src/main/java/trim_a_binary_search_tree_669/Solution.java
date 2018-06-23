package trim_a_binary_search_tree_669;

import utils.TreeNode;

public class Solution {

  // TODO: implement proper tests

  public TreeNode trimBST(TreeNode n, int min, int max) {
    if (n == null) return null;
    // if value is less then min > ignore left branch, replace current node with trimmed right branch
    if (n.val < min) { return trimBST(n.right, min, max); }

    // if value is more then tax > ignore right branch, replace current node with trimmed left branch
    if (n.val > max) { return trimBST(n.left, min, max); }

    // if value is within boundaries - trim branches
    n.left = trimBST(n.left, min, max);
    n.right = trimBST(n.right, min, max);
    return n;
  }

}
