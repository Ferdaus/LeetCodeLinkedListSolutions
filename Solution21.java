/*
LeetCode Problem Number: 21
Link : https://leetcode.com/problems/merge-two-sorted-lists/description/
Merge two Sorted List

You are given the heads of two sorted linked lists list1 and list2.
Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
Return the head of the merged linked list.

Solution Approach:
    Create a preHead with dummy node (Not Null)
    Loop through  the two lists
    Maintain a pre node
    Prev.next will be current value of list1 or list2

 */
public class Solution21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode head1 = list1;
        ListNode head2 = list2;

        ListNode preHead = new ListNode(-200);
        ListNode prev = preHead;

        while(head1!=null && head2!=null){
            if(head1.val<= head2.val){
                prev.next = head1;
                head1= head1.next;
            }
            else{
                prev.next  = head2;
                head2 = head2.next;

            }
            prev = prev.next;
        }

        if(head1==null)
            prev.next = head2;
        else if(head2 == null)
            prev.next = head1;

        return preHead.next;
    }
}
