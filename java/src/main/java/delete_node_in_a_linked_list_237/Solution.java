package delete_node_in_a_linked_list_237;

import utils.ListNode;

public class Solution {

  public void deleteNode(ListNode node) {

    // We don't have access to head so we can only modify the list starting with Node node
    // We can't update link TO this node
    // Solution is to copy next node into current node and update link from current node to next's next

    node.val = node.next.val;
    node.next = node.next.next;

  }

}
