public class Driver {


    public static void main(String[] args) {
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Solution206 sln206 = new Solution206();
        ListNode result = sln206.reverseList(node1);

        while (result!=null){
            System.out.println(result.val);
            result = result.next;
        }*/

/*        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(0);
        ListNode node4 = new ListNode(-4);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2;

        Solution141 sln141 = new Solution141();
        boolean result = sln141.hasCycle(node1);
        System.out.println(result);*/

 /*     ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(3);
        ListNode node23 = new ListNode(4);

        node21.next = node22;
        node22.next = node23;
        node23.next = null;

        Solution21 sln21 = new Solution21();
        ListNode result = sln21.mergeTwoLists(node1, node21);

        while(result!=null)
        {
            System.out.print(result.val+ " ");
            result = result.next;
        }*/

 // Driver code for Solution 143
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Solution143 sln143 = new Solution143();
        sln143.reorderList(node1);
        ListNode count = node1;
        while(count!=null)
        {
            System.out.print(count.val+ " ");
            count = count.next;
        }*/
//Driver code for Solution 19
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Solution19 sln19 = new Solution19();
        ListNode result = sln19.removeNthFromEnd(node1,2);

        while(result!=null)
        {
            System.out.print(result.val+ " ");
            result = result.next;
        }

    }

}
