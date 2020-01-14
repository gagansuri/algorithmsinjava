package com.mixedcode;

public class StackOfStringAgain {

    Node head=null;

    private class Node {
        private String text;
        private Node next;
    }



    public void push(String text){
        Node node=new Node();
        node.text=text;
        node.next=head;
        head=node;
    }


    public String pop(){
        String text=head.text;
        head=head.next;
        return text;
    }

    private boolean isEmpty() {
        return head==null;
    }

}
