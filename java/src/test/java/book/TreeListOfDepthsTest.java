package book;

import org.junit.Test;
import utils.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class TreeListOfDepthsTest {

  TreeListOfDepths solution = new TreeListOfDepths();

  @Test
  public void getList() {

    TreeNode tree = new TreeNode(1)
            .addLeft(2)
            .addRight(3);
    tree.left.addLeft(4);
    ArrayList ans = solution.getList(tree);

    LinkedList l1 = new LinkedList();
    l1.add(1);

    LinkedList l2 = new LinkedList();
    l2.add(2);
    l2.add(3);

    LinkedList l3 = new LinkedList();
    l3.add(4);

    ArrayList exp = new ArrayList();
    exp.add(l1);
    exp.add(l2);
    exp.add(l3);

    assertEquals(exp, ans);
  }
}