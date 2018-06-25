package maximum_binary_tree_654;

import utils.TreeNode;

import java.util.HashMap;

public class Solution {

  /**
   * O (n^2) solution as we need to iterate through an array each time to get max.
   * @param nums
   * @return
   */
  public TreeNode constructMaximumBinaryTree(int[] nums) {
    TreeNode ans = construct(nums, 0, nums.length);
    return ans;
  }

  private  TreeNode construct(int[] nums, int l, int r) {

    if (l == r) return null;

    // generate root
    int maxI = getMaxIndex(nums, l, r);
    TreeNode root = new TreeNode(nums[maxI]);
    root.left = construct(nums, l, maxI);
    root.right = construct(nums, maxI + 1, r);

    return root;
  }

  private int getMaxIndex(int[] nums, int l, int r) {
    int maxI = l;
    for (int i = l; i <= r; i++) {
      if (nums[i] > nums[maxI]) {
        maxI = i;
      }
    }
    return maxI;
  }

}
