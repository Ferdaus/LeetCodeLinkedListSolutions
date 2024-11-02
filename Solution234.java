import java.util.Stack;

/*
LeetCode Problem Number: 234
Link : https://leetcode.com/problems/palindrome-linked-list/description/
 Palindrome Linked List

Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Solution Approach:
Use a stack. traverse the linkedlist and push everything in a stack.
then traverse the linkedlist again from the beginning (head) while comparing with values from stack
 */
public class Solution234 {
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        ListNode temp = head;

        while(temp!=null){
            stack.push(temp.val);
            temp = temp.next;
        }
        while(head!=null){
            int value = head.val;
            int sval = stack.pop();
            if(value!= sval)
                {
                    return false;
                }
            head = head.next;
        }
        return true;
    }
}
