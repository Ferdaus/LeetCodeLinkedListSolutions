/*
LeetCode Problem Number: 160
Link : https://leetcode.com/problems/intersection-of-two-linked-lists/
Intersection of Two Linked Lists

Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.
For example, the following two linked lists begin to intersect at node c1:
----
The test cases are generated such that there are no cycles anywhere in the entire linked structure.

Note that the linked lists must retain their original structure after the function returns.

Custom Judge:

The inputs to the judge are given as follows (your program is not given these inputs):

intersectVal - The value of the node where the intersection occurs. This is 0 if there is no intersected node.
listA - The first linked list.
listB - The second linked list.
skipA - The number of nodes to skip ahead in listA (starting from the head) to get to the intersected node.
skipB - The number of nodes to skip ahead in listB (starting from the head) to get to the intersected node.
The judge will then create the linked structure based on these inputs and pass the two heads, headA and headB to your program. If you correctly return the intersected node, then your solution will be accepted.



Solution Approach:
Two Approach:
Approach 1: HashMap easy and straighforward
Use HashMap and put all elements through one chain that in a HashMap.
Then go through all elements through second head and check if any of the elements through second chain is already in the map.
This is O(N+M)
Space O(N) or O(M)
Approach 2:
find the length of both chain
find the difference
use the difference to make both chain same size (skip the diff amount elements from the longer chain)
Then loop through both chain and see if any elements match (i.e. their hashcode matches)
if we find match, then return the matched element, otherwise return null

just copy the value from next node to current node. then remove the next node.
 */
public class Solution160 {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
      /*  HashMap<ListNode, Boolean> visited = new HashMap<>();

        ListNode tempHeadA = headA;
        while(tempHeadA!=null){
            visited.put(tempHeadA, true);
            tempHeadA = tempHeadA.next;

        }

        ListNode tempHeadB = headB;
        while(tempHeadB!=null){
            if(visited.containsKey(tempHeadB))
               return tempHeadB;
            tempHeadB = tempHeadB.next;

        }
        return null; */

        //Alternative solution (O(N+M) in O(1) space >> )
        //first find leanghth through A chain
        //first find leanghth through B chain
        //then move throgh the longer chain to make them same size
        // then compare
        int countA = 0;
        int countB = 0;
        ListNode tempHeadA = headA;
        ListNode tempHeadB = headB;

        while(tempHeadA!=null){
            countA++;
            tempHeadA = tempHeadA.next;

        }

        while(tempHeadB!=null){
            countB++;
            tempHeadB = tempHeadB.next;

        }
        int diff;
        if(countB> countA){
            diff = countB-countA;
            while(diff > 0)
            {
                headB= headB.next;
                diff--;
            }
            while(headA!=null && headB!=null){
                if(headA.hashCode()!=headB.hashCode()){
                    headA = headA.next;
                    headB = headB.next;
                }
                else{
                    return headA;
                }
            }
        }
        else{
            diff = countA-countB;
            while(diff > 0)
            {
                headA= headA.next;
                diff--;
            }
            while(headA!=null && headB!=null){
                if(headA.hashCode()!=headB.hashCode()){
                    headA = headA.next;
                    headB = headB.next;
                }
                else{
                    return headA;
                }
            }
        }
        return null;
    }
}
