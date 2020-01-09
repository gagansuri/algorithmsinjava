package com.leetcode.recursion;

public class SwapPairs {

    public ListNode swapPairs1(ListNode head) {

        if(head==null || head.next==null) {
        return head;
        }

            ListNode next=head.next;
            head.next=swapPairs1(next.next);
            next.next=head;

    return next;
    }


 /*   public ListNode swapPairs(ListNode head) {



        ListNode current=null;


        if (head != null) {
            System.out.println(head.val);
            current = head;
            ListNode next = current.next;
            current.next = next.next;
            next.next = current;
            head=current.next;
            return swapPairs(head);
        }
        return current;
    }
*/

    private class ListNode {
        int val;
        ListNode next;
    }

    public  ListNode createList() {
        ListNode node1=new ListNode();
        node1.val=1;
        ListNode node2=new ListNode();
        node2.val=2;
        node1.next=node2;

        ListNode node3=new ListNode();
        node3.val=3;
        node2.next=node3;

        ListNode node4=new ListNode();
        node4.val=4;

        node3.next=node4;
        return  node1;
    }

    public static void main(String[] args) {
        SwapPairs swp=new SwapPairs();
        ListNode head=swp.createList();
        head=swp.swapPairs1(head);

        System.out.println(head);


    }
}


