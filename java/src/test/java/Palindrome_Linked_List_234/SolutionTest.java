package Palindrome_Linked_List_234;

import org.junit.Test;
import utils.ListNode;

import static org.junit.Assert.*;

public class SolutionTest {

  Solution solution = new Solution();

  @Test
  public void test_positive() {
    ListNode l = new ListNode(1).add(2).add(3).add(2).add(3).add(2).add(1);
    assertTrue(solution.isPalindrome(l));
  }

  @Test
  public void test_negative() {
    ListNode l = new ListNode(1).add(2).add(3).add(1);
    assertFalse(solution.isPalindrome(l));
  }

  @Test
  public void test_oneNode() {
    ListNode l = new ListNode(1);
    assertTrue(solution.isPalindrome(l));
  }

  @Test
  public void test_empty() {
    ListNode l = new ListNode();
    assertTrue(solution.isPalindrome(l));
  }

  @Test
  public void test_oneNull() {
    ListNode l = null;
    assertTrue(solution.isPalindrome(l));
  }
}