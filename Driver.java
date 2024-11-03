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

        Solution19 sln19 = new Solution19();
        ListNode result = sln19.removeNthFromEnd(node1,2);

        while(result!=null)
        {
            System.out.print(result.val+ " ");
            result = result.next;
        }*/

//Driver code for Solution 203
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(6);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(4);
        ListNode node6 = new ListNode(5);
        ListNode node7 = new ListNode(6);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = null;

        Solution203 sln203 = new Solution203();
        ListNode result = sln203.removeElements(node1,6);

        while(result!=null)
        {
            System.out.print(result.val+ " ");
            result = result.next;
        }*/
//Driver for 237
/*        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(5);
        ListNode node3 = new ListNode(1);
        ListNode node4 = new ListNode(9);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;


        Solution237 sln237 = new Solution237();
        sln237.deleteNode(node2);
        printList(node1);*/

//Driver for 160
/*        ListNode nodeA = new ListNode(4);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(8);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);

        nodeA.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        ListNode nodeB = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(1);

        nodeB.next = node6;
        node6.next = node7;
        node7.next = node3;


        Solution160 sln160 = new Solution160();
        ListNode result = sln160.getIntersectionNode(nodeA, nodeB);
        printList(result);*/
//Driver code for  234
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(1);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = null;

        Solution234 sln234 = new Solution234();
        boolean result = sln234.isPalindrome(node1);
        System.out.println(" Palindrome: "+result);*/

        //Driver code for 83
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(1);
        ListNode node3 = new ListNode(2);
        ListNode node4 = new ListNode(3);
        ListNode node5 = new ListNode(3);


        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = null;

        Solution83 sln83 = new Solution83();
        ListNode result = sln83.deleteDuplicates(node1);
        printList(result);*/

        //Driver code for 1290
/*        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(0);
        ListNode node3 = new ListNode(1);


        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        Solution1290 sln1290 = new Solution1290();
        int result = sln1290.getDecimalValue(node1);
        System.out.println("Decimal value is:"+ result);*/

//Driver for 876
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

        Solution876 sln876 = new Solution876();
        ListNode result = sln876.middleNode(node1);
        printList(result);*/

        //Driver for 2
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);

        node1.next = node2;
        node2.next = node3;
        node3.next = null;

        ListNode node_1 = new ListNode(5);
        ListNode node_2 = new ListNode(6);
        ListNode node_3 = new ListNode(4);

        node_1.next = node_2;
        node_2.next = node_3;
        node_3.next = null;

        Solution2 sln2 = new Solution2();
        ListNode result = sln2.addTwoNumbers(node1, node_1);
        printList(result);
    }

    public static void printList(ListNode result){
        while(result!=null)
        {
            System.out.print(result.val+ " ");
            result = result.next;
        }
    }

}
