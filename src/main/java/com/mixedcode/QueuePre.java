package com.mixedcode;

public class QueuePre {

    private Node front=null; //dequeue from front
    private Node back=null;  //enqueue from back

    private class Node {
        String text;
        Node next;
    }


    public QueuePre() {

    }


    public void enqueue(String s) {
        Node node=new Node();
        node.text=s;
        if(front==back && front==null) {
            front=node;
            back=node;
        }
        back.next=node;
        back=node;


    }

    public boolean isEmpty(){
        return front==null;
    }


    public String dequeue() {
        if(front!=null) {
            String item = front.text;
            front = front.next;
            return item;
        } else {
            return null;
        }
    }
}
