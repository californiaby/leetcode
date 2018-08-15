package Binary_Tree_Inorder_Traversal_94;

/*
Given a binary tree, return the inorder traversal of its nodes' values.

Input: [1,null,2,3]
   1
    \
     2
    /
   3

Output: [1,3,2]
 */

import utils.TreeNode;

import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class Solution {

  /*
  Inorder: left > node > right
   */
  public List<Integer> inorderTraversal(TreeNode root) {
    List<Integer> ans = new LinkedList<>();
    doInorderTraversal(root, ans);
    return(ans);
  }

  private void doInorderTraversal(TreeNode node, List<Integer> ans) {
    if (node != null) {
      doInorderTraversal(node.left, ans);
      ans.add(node.val);
      doInorderTraversal(node.right, ans);
    }
  }

  /**
   * Alternative solution via stack
   * @param root
   * @return
   */
  private List<Integer> inorderTraversalStack(TreeNode root) {
    List<Integer> ans = new LinkedList<>();
    Stack<TreeNode> stack = new Stack<>();
    TreeNode curr = root;

    while (curr != null && !stack.isEmpty()) {

      // Move down through left branch, add nodes to stack
      while(curr != null) {
        stack.push(curr);
        curr = curr.left;
      }

      // Achieved end of left branch
      curr = stack.pop();
      ans.add(curr.val);
      curr = curr.right;
    }

    return(ans);
  }
}
