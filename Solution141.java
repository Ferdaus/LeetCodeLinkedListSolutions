/*
LeetCode Problem Number: 141
Link : https://leetcode.com/problems/linked-list-cycle/
Linked List Cycle

Given head, the head of a linked list, determine if the linked list has a cycle in it.
There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.
Return true if there is a cycle in the linked list. Otherwise, return false.

Solution Approach:
First Approach: Use 2 runners: slow and fast
if at some point slow == fast, then there is a cycle
otherwise, no cycle
slow = slow.next
fast = fast.next.next

Second Approach
Use HashMap
if we find a node that already exists in the map, there is cycle
 */

import java.util.HashMap;

public class Solution141 {
    public boolean hasCycle(ListNode head) {
       /* ListNode slow = head;
        ListNode fast = head;

        while(fast!=null && fast.next!=null){

            slow = slow.next;
            fast = fast.next.next;
            if(slow== fast)
                return true;
        }

        return false; */

        HashMap<ListNode, Boolean> map = new HashMap<>();
        ListNode curr = head;
        while(curr!=null){
            if(!map.containsKey(curr)){
                map.put(curr, true);
            }
            else
                return true;

            curr = curr.next;

        }
        return false;


    }
}
