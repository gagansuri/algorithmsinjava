public class AddTwoLargeIntegers {


    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode firstNode=null;
        ListNode previous=null;
        int carry=0;
        if(l1==null) return l2;
        if(l2==null) return l1;

        while(l1!=null && l2!=null) {

            if(firstNode==null) {
                firstNode=new ListNode(0);
                firstNode.val = (l1.val+l2.val+carry)%10;
                carry=(l1.val+l2.val+carry)/10;
                firstNode.next=null;
                previous=firstNode;


            } else {
                ListNode node=new ListNode(0);
                node.val = (l1.val+l2.val+carry)%10;
                carry=(l1.val+l2.val+carry)/10;
                node.next=null;
                previous.next=node;
                previous=node;

            }
            l1=l1.next;
            l2=l2.next;
        }

        if(l1==null) {
            while(l2!=null) {
                ListNode node=new ListNode(0);
                node.val = (l2.val+carry)%10;
                carry=(l2.val+carry)/10;
                node.next=null;
                previous.next=node;
                previous=node;
                l2=l2.next;
            }
        }
        if(l2==null) {
            while(l1!=null) {
                ListNode node=new ListNode(0);
                node.val = (l1.val+carry)%10;
                carry=(l1.val+carry)/10;
                node.next=null;
                previous.next=node;
                previous=node;
                l1=l1.next;
            }
        }

        if(carry!=0) {
            ListNode node=new ListNode(carry);
            node.next=null;
            previous.next=node;
        }



        return firstNode;


    }

 private class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
 }
 }
