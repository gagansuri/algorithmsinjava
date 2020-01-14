package com.leetcode.recursion;

public class ReverseList {


    class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
      }
  }


    public ListNode reverseList(ListNode head) {
        ListNode current=head;
        ListNode pre=null;
        ListNode next=null;

        while(current!=null) {
            //point current.next to pre
            //current=next;
            //next=current.next
            next=current.next;
            current.next=pre;
            pre=current;
            current=next;

        }
        return pre;
    }


    public ListNode reverseListRecursive(ListNode head) {
            ListNode first;
            if(head==null || head.next==null) return head;
            first=reverseListRecursive(head.next);
            head.next.next=head;
            head.next=null;
            return first;

        }


    public ListNode createList() {
        ListNode first=new ListNode(1);
        ListNode second=new ListNode(2);
        ListNode third=new ListNode(3);
        ListNode fourth=new ListNode(4);
        ListNode fifth=new ListNode(5);

        first.next=second;
        second.next=third;
        third.next=fourth;
        fourth.next=fifth;
        fifth.next=null;


        return first;
    }

    private void printList(ListNode head) {
        ListNode temp=head;

        while(temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }


    }


    public static void main(String[] args) {

        ReverseList rv=new ReverseList();

        ListNode head=rv.createList();

        ListNode h1=rv.reverseListRecursive(head);

        rv.printList(h1);


    }
}
