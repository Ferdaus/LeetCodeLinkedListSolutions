/*
LeetCode Problem Number: 876
Link :https://leetcode.com/problems/middle-of-the-linked-list/
Middle of the Linked List

Given the head of a singly linked list, return the middle node of the linked list.
If there are two middle nodes, return the second middle node.

Solution Approach:
slow fast pointer
slow will point to the middle node

 */


public class Solution876 {
    public ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        while(fast!= null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;


    }
}
