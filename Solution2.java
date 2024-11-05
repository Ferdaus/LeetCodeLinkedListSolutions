/*
LeetCode Problem Number: 2
Link : https://leetcode.com/problems/add-two-numbers/
Add Two Numbers

You are given two non-empty linked lists representing two non-negative integers. The digits are stored in reverse order, and each of their nodes contains a
single digit. Add the two numbers and return the sum as a linked list.

You may assume the two numbers do not contain any leading zero, except the number 0 itself.

Solution Approach:


 */
public class Solution2 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        /* Solution below coded on 11/3/2024*/
        ListNode dummyHead = new ListNode(-1);
        int carry =0;
        ListNode list1 = l1, list2 = l2, prev = dummyHead;
        int tempResult =0;

        while(true){
            if(list1!=null && list2!=null){
                tempResult = (list1.val+list2.val+ carry)%10;
                carry = (list1.val+list2.val+ carry)/10;
                ListNode curr = new ListNode(tempResult);
                prev.next = curr;
                prev = prev.next;
                list1 = list1.next;
                list2 = list2.next;
            }
            else if(list1!=null && list2 == null){
                tempResult = (list1.val+ carry)%10;
                carry = (list1.val+ carry)/10;
                ListNode curr = new ListNode(tempResult);
                prev.next = curr;
                prev = prev.next;
                list1 = list1.next;

            }
            else if(list1==null && list2!=null){
                tempResult = (list2.val+ carry)%10;
                carry = (list2.val+ carry)/10;
                ListNode curr = new ListNode(tempResult);
                prev.next = curr;
                prev = prev.next;
                list2 = list2.next;

            }
            else{
                break;
            }



        }
        if(carry ==1){
            ListNode last = new ListNode(1);
            prev.next = last;
        }

        return dummyHead.next;

    }
}
