public class Solution83 {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null)
            return head;

        ListNode current = head;
        ListNode next_node = head.next;

        while(next_node!=null){
            if(current.val== next_node.val)
            {
                current.next = next_node.next;
                next_node = next_node.next;
            }
            else{
                ListNode tmp = next_node;
                next_node = next_node.next;
                current = tmp;
            }
        }
        return head;
    }
}
