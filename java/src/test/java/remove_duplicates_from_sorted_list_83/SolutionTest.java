package remove_duplicates_from_sorted_list_83;

import org.junit.Test;
import utils.ListNode;

import java.util.List;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void deleteDuplicates() {
    ListNode list = new ListNode(1).add(1).add(2).add(3).add(3).add(4);
    ListNode exp = new ListNode(1).add(2).add(3).add(4);

    assertEquals(exp.toString(), solution.deleteDuplicates(list).toString());
  }

  @Test
  public void test() {
    ListNode list = new ListNode(1).add(1).add(2).add(3).add(3);
    ListNode exp = new ListNode(1).add(2).add(3);

    assertEquals(exp.toString(), solution.deleteDuplicates(list).toString());
  }
}