package com.mixedcode;

public class QueueWithArray {

    private String queueArray[];
    private int head=0;
    private int tail=0;


    public void enQueue(String text) {
        queueArray[tail++]=text;
    }

    public String deQueue() {
        return queueArray[head++];
    }

    public boolean isEmpty() {
        return true;
    }

}
