package Find_Duplicate_Subtrees_652;

import utils.TreeNode;

import java.util.*;

public class Solution {

  private int t;
  private Map<String, Integer> trees;
  private Map<Integer, Integer> count;
  private List<TreeNode> ans;

  public List<TreeNode> findDuplicateSubtrees(TreeNode root) {
    t = 1;
    trees = new HashMap<>();
    count = new HashMap<>();
    ans = new ArrayList<>();
    lookup(root);

    return ans;
  }

  private int lookup(TreeNode node) {
    if (node == null) return 0;
    String serial = node.val + "," + lookup(node.left) + "," + lookup(node.right);
    int uid = trees.computeIfAbsent(serial, s -> t++);
    count.put(uid, count.getOrDefault(uid, 0) + 1);

    if (count.get(uid) == 2) {
      ans.add(node);
    }

    return uid;
  }


  public List<TreeNode> findDuplicateSubtreesMine(TreeNode root) {
    Map<String, TreeNode> hash = new HashMap<>();
    ans = new ArrayList<>();

    doTheMagic(root, hash);
    return ans;
  }

  private String doTheMagic(TreeNode root, Map<String, TreeNode> hash) {
    if (root == null) return "#";
    String code = root.val + "," + doTheMagic(root.left, hash) + "," + doTheMagic(root.right, hash);

    if (hash.containsKey(code)) {
      ans.add(root);
    } else {
      hash.put(code, root);
    }

    return code;
  }
}
