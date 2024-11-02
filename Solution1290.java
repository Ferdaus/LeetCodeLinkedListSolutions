/*
LeetCode Problem Number: 1290
Link : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
Convert Binary Number in a Linked List to Integer

Given head which is a reference node to a singly-linked list. The value of each node in the linked list is either 0 or 1. The linked list holds the binary representation of a number.
Return the decimal value of the number in the linked list.
The most significant bit is at the head of the linked list.

Solution Approach:
 */

public class Solution1290 {
    public int getDecimalValue(ListNode head) {
        int bitPos= 0;
        ListNode tempHead =head;

        while(tempHead!=null){
            bitPos++;
            tempHead = tempHead.next;
        }

        int result = 0;
        while(head!=null){
            result = result + head.val*(int)Math.pow(2, bitPos-1);
            head = head.next;
            bitPos--;
        }
        return result;
    }
}
