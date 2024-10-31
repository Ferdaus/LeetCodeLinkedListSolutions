/*
LeetCode Problem Number: 206
Link : https://leetcode.com/problems/reverse-linked-list/description/
Reverse Linked List

Given the head of a singly linked list, reverse the list, and return the reversed list.

Solution Approach:
O(n)
 */

public class Solution206 {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode next_node = null;
        ListNode prev = null;

        while(current!=null){
            next_node = current.next;
            current.next =prev ;
            prev = current;
            current = next_node;
        }

        return prev;

    }
}
