/*
LeetCode Problem Number: 23
Link : https://leetcode.com/problems/merge-k-sorted-lists/description/
Merge k Sorted Lists

You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.
Merge all the linked-lists into one sorted linked-list and return it.

Solution Approach:
At any moment, find the minimum value of the heads. then prev.next = minimum of the heads.
Do this until we have any non-null node left. This


 */

public class Solution23 {
    public ListNode mergeKLists(ListNode[] lists) {
        int numberOfLists = lists.length;
        ListNode[] heads = new ListNode[numberOfLists];
        for(int i =0; i< numberOfLists; i++){
            heads[i] = lists[i];
        }

        ListNode preHead = new ListNode(-20000);
        ListNode prev = preHead;

        while(!isAllNull(heads)){
            int j = minimum(heads);
            prev.next = heads[j];
            heads[j] = heads[j].next;

            prev = prev.next;
        }

        return preHead.next;


    }
    int minimum(ListNode[] list){
        int size = list.length;
        int minimum= Integer.MAX_VALUE;
        int minIndex= 0;
        for(int i =0; i< size; i++){
            if(list[i]!= null && list[i].val< minimum){
                minimum = list[i].val;
                minIndex = i;
            }
        }

        return minIndex;
    }
    boolean isAllNull(ListNode[] list){
        int size=  list.length;
        for(int i =0; i< size;i++){
            if(list[i]!= null)
                return false;
        }

        return true;
    }
}
