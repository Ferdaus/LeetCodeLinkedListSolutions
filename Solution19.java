/*
LeetCode Problem Number: 19
Link : https://leetcode.com/problems/remove-nth-node-from-end-of-list/
Remove Nth Node From End of List

Given the head of a linked list, remove the nth node from the end of the list and return its head.

Solution Approach:
  Find the exact node behind the node to be deleted.
  use a dummy node;
  use 2 pointer node : first and second
  second pointer will advance by nth node from dummy node;

  Now just iterating over the both pointers until the second pointer reaches the end,
  That way first pointer will point to the node where node behind the nth node from end
  then delete the node;


 */

public class Solution19 {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode first = dummy, second = dummy ;
        int count  = n;
        while(count>=0){
            second = second.next;
            count--;
        }

        // find the node previous of the node to be deleted
        while(second!=null){
            first = first.next;
            second = second.next;

        }

        //remove the nth node from end of list;
        first.next = first.next.next;
        return dummy.next;

    }
}
