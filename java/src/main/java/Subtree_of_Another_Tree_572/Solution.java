package Subtree_of_Another_Tree_572;

import utils.TreeNode;

/*
'Given two non-empty binary trees s and t, check whether tree t has exactly the same structure and node values
with a subtree of s. A subtree of s is a tree consists of a node in s and all of this node's descendants.
The tree s could also be considered as a subtree of itself.
 */

public class Solution {
  public boolean isSubtree(TreeNode s, TreeNode t) {

    // Check null values
    if (s == null || t == null) return false;

    // Iterate through the bigger tree until we find a match of the value
    if (s.val != t.val) {
      return isSubtree(s.left, t) || isSubtree(s.right, t);
    } else {

      // Got match in values. Check if there's a match starting from current node
      boolean isMatchFromCurrentNode = isMatch(s, t);

      // If isMatchFromCurrentNode is true, we've got a match!
      // Otherwise - handle case with duplicate nodes (i.e. when tree has other nodes with starting value)
      return isMatchFromCurrentNode ? true : isSubtree(s.left, t) || isSubtree(s.right, t);
    }
  }

  private boolean isMatch(TreeNode a, TreeNode b) {
    if (a == null && b == null) {             // both are null
      return true;
    } else if (a == null || b == null) {      // one of nodes is null
      return false;
    } else if (a.val != b.val) {              // values mismatch
      return false;
    } else {                                  // recursively check branches
      return isMatch(a.left, b.left) && isMatch(a.right, b.right);
    }
  }
}


/*

// Check null values. If both are null - it's the end of the tree. If one of them - it's a mismatch.
    if (s == null && t == null) {
      return true;
    } else if (s == null || t == null) {
      return false;
    }

    // Iterate through the bigger tree until current node value matches the smaller tree's node
    if (s.val == t.val) {

      // We got the match in values, now compare values and run recursively for each leaf
      if (t.left != null || t.right != null) {
        return (isSubtree(s.left, t.left) && isSubtree(s.right, t.right));
      } else {
        return true;
      }

    } else {

      // Node values do not match - so iterate through the bigger until we get a match
      return (isSubtree(s.left, t) || isSubtree(s.right, t));
    }

 */
