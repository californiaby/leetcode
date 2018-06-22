package book;

import utils.TreeNode;

public class TreeMinimalBST {

  TreeNode createMinimalBST(int[] array) {
    return createMinimalBST(array, 0, array.length - 1);
  }

  private TreeNode createMinimalBST(int[] arr, int start, int end) {
    if (end < start) return null;

    int mid = (start + end) / 2;
    TreeNode n = new TreeNode(arr[mid]);
    n.left = createMinimalBST(arr, start, mid - 1);
    n.right = createMinimalBST(arr, mid + 1, end);

    return n;
  }

}
