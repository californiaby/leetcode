package Serialize_and_Deserialize_Binary_Tree_297;

import org.junit.Test;
import utils.TreeNode;

import static org.junit.Assert.*;

public class CodecTest {

  Codec codec = new Codec();

  @Test
  public void serialize() {
    TreeNode tree = new TreeNode(1);
    tree.addLeft(2);
    tree.left.addRight(4);
    tree.addRight(3);
    tree.right.addRight(5);
    tree.right.right.addLeft(6);

    String s = codec.serialize(tree);
    TreeNode newTree = codec.deserialize(s);

    assertEquals(newTree, tree);
  }

  @Test
  public void deserialize() {
  }
}