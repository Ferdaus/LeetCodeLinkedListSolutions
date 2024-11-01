/*
LeetCode Problem Number: 237
Link : https://leetcode.com/problems/delete-node-in-a-linked-list/
Delete Node in a Linked List

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Solution Approach:
Clever:
just copy the value from next node to current node. then remove the next node.
 */
public class Solution237 {
    public void deleteNode(ListNode node) {
/*        ListNode prev = node;
        ListNode temp =  node.next;
        node.val = node.next.val;
        node.next = temp.next;
      */

        ListNode current =  node;
        ListNode after = node.next;

        current.val = after.val;
        current.next = after.next;

    }
}
