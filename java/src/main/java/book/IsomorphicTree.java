package book;

import utils.TreeNode;

public class IsomorphicTree {
  public boolean isTrue(TreeNode a, TreeNode b) {

    // Both roots are null -> true
    if (a == null && b == null) return true;

    // Only one is null -> false
    if (a == null || b == null) return false;

    // Data isn't matching -> false
    if (a.val != b.val) return false;

    // Since data is matching, children can be flipped or not flipped
    boolean trueNotFlipped = isTrue(a.left, b.left) && isTrue(a.right, b.right);
    boolean trueFlipped = isTrue(a.left, b.right) && isTrue(a.right, b.left);

    return trueFlipped || trueNotFlipped;
  }
}
