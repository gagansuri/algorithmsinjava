package com.mixedcode;

public class StackOfStringsModified {
    Node head=null;

    public String pop(){
        String content=head.content;
        head=head.next;
        return content;
    }
// implement stack using a linked list
// the pop is simple return the


    public boolean isEmpty(){
        return head==null;
    }

    //push

    /**
     *
     * @param content
     *
     *
     * add the new node to the beginning of the linked list
     */
    void push (String content) {
        Node n=new Node();
        n.content=content;
        n.next=head;
        head=n;
        }




    private class Node{

        String content;
        Node next;
    }
}
