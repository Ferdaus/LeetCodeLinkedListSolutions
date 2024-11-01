/*
LeetCode Problem Number: 143
Link : https://leetcode.com/problems/reorder-list/description/
Reorder List

You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

Solution Approach:
  Step 1: break it into half: use slow runner and fast runner: slow runner will be the middle node
  reverse the second half
  interleave the first and second linkedlist

 */

public class Solution143 {
    public void reorderList(ListNode head) {


        //find the middle of the linked list
        ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next.next;
        }

        //Reverse the linked list from middle

        ListNode prev = null;
        ListNode curr = slow;
        ListNode nextTemp;
        while (curr != null) {
            nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }

        //merge two sorted list
        ListNode first = head, second  = prev;
        int i = 0;
        while(second.next!=null ){
            ListNode tmp  = first.next;
            first.next = second;
            first = tmp;

            tmp  = second.next;
            second.next = first;
            second = tmp;
            i++;

        }



    }
}
