package com.mixedcode;

public class QueuePost {

    private Node head;
    private Node tail;



    /**
     * enqueue add elements at the end/tail of the queue
     * create a new node first
     * if adding a first node point, both head and tail to this node
     */
    public void enQueue(String text) {
        Node node = createNode(text);
        if(isEmpty()) {
            head=node;
        } else {
            tail.next=node;
        }
        tail=node;
    }

    private Node createNode(String text) {
        Node node=new Node();
        node.text=text;
        node.next=null;
        return node;
    }

    /**
     *
     * @return
     *
     * if empty return null
     * else return the node from head and move head to next
     */
    public String deQueue(){
        //
        if(isEmpty()) {
            return null;
        } else {
            String text=head.text;
            head=head.next;
            return text;
        }

    }


    public boolean isEmpty(){

        //return head==tail;
        return head==null;

    }



    private class Node{
        private String text;
        Node next;
    }
}
