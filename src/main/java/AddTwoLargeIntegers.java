public class AddTwoLargeIntegers {

//TODO: will do later
    public ListNode addTwoNumbersRecursive(ListNode l1, ListNode l2) {
        if(l1!=null && l2!=null) {

        }

        return null;
    }



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


    public void client() {
        int[] one={3,5,6,7,8};  //8756
        int[] two={4,6,7,8,9};  // 98764
        ListNode number1=createList(one);
        ListNode number2=createList(two);
        printNumber(number1);
        printNumber(number2);
        ListNode result=addTwoNumbers(number1,number2);
        printNumber(result);

    }


    public void printNumber(ListNode n) {
        StringBuilder number=new StringBuilder();
        while(n!=null) {
            number.append(n.val);
            n=n.next;
        }
        System.out.println(number.reverse().toString());
    }


    public static void main(String[] args) {
        AddTwoLargeIntegers addTwoLargeIntegers=new AddTwoLargeIntegers();
        addTwoLargeIntegers.client();
    }

    private ListNode createList(int[] one) {
        ListNode root = new ListNode(one[0]);
        ListNode temp = root;
        for (int i = 1; i < one.length; i++) {
            ListNode node = new ListNode(one[i]);
            node.next = null;
            temp.next = node;
            temp = node;
        }

        return root;
    }
}
