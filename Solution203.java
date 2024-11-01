/*
LeetCode Problem Number: 203
Link : https://leetcode.com/problems/remove-linked-list-elements/
Remove Linked List Elements

Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

Solution Approach:
We just have to maintain two pointer nodes: current node and previous node.
To this end, i introduced a  dummy node before the head.
In the beginning,  dummy node is prev node and head is current node.
We then just iterate over the linked list. whenever value matches for the current node, we remove that node.

 */

public class Solution203 {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prev = dummy;
        ListNode current = head;

        while(current!=null){
            if(current.val!=val){
                prev = prev.next;
                current = current.next;
            }
            else{
                prev.next = current.next;
                current = current.next;
            }
        }
        return dummy.next;

    }
}
