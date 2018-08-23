package Serialize_and_Deserialize_Binary_Tree_297;

import utils.TreeNode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Codec {

  private static final String SPLITTER = ",";
  private static final String NAN = "null";

  /**
   * Serializes tree to String. Uses preorder traversal to generate the string.
   * @param root
   * @return
   */
  public String serialize(TreeNode root) {
    StringBuilder sb = new StringBuilder();
    doSerialize(root, sb);
    return sb.toString();
  }

  /**
   * Builds a String representing node.
   * Uses preorder traversal, store null nodes as "null" and uses ',' as delimiter.
   * @param node
   * @param sb
   */
  private void doSerialize(TreeNode node, StringBuilder sb) {
    if (node == null) {
      sb.append(NAN).append(SPLITTER);
    } else {
      sb.append(node.val).append(SPLITTER);
      doSerialize(node.left, sb);
      doSerialize(node.right, sb);
    }
  }

  /**
   * Deserializes the string to Binary Tree.
   * String is generated using preorder traversal.
   * @param data
   * @return
   */
  public TreeNode deserialize(String data) {
    Queue<String> q = new LinkedList<>();
    q.addAll(Arrays.asList(data.split(SPLITTER)));
    return doDeserialize(q);
  }

  private TreeNode doDeserialize(Queue<String> q) {
    String val = q.poll();
    if (val == null || val.equals(NAN)) {
      return null;
    } else {
      TreeNode node = new TreeNode(Integer.valueOf(val));
      node.left = doDeserialize(q);
      node.right = doDeserialize(q);

      return node;
    }
  }

}