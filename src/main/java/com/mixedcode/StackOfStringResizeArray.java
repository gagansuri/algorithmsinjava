package com.mixedcode;

public class StackOfStringResizeArray {

    private String[] stringArray;
    private int pointer=0;

    public StackOfStringResizeArray() {
        stringArray=new String[10];

    }


    public void push(String s) {
        if(pointer==stringArray.length) {
            resizeArray(2*pointer);
        }
        stringArray[pointer++]=s;

    }


    public String pop() {
        //shrink the array when it is quarter full
        String item=stringArray[--pointer];
        stringArray[pointer]=null;
        if(pointer>0 && pointer==stringArray.length/4) {
            resizeArray(stringArray.length/2);
        }
        return item;
    }


    private void resizeArray(int n) {
        String[] copyArray=new String[n];

        for(int i=0;i<pointer;i++) {
            copyArray[i]=stringArray[i];
        }
        this.stringArray=copyArray;

    }

}
