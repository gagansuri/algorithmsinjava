package com.leetcode.recursion;

public class StringReverseRecursive {


    public static void main(String[] args) {
        StringReverseRecursive sr=new StringReverseRecursive();
        System.out.println(sr.reverse("Hannah"));
        String s="Hannah";

        String s1="Hannah1";
        sr.reverseString(s.toCharArray());

        sr.reverseString(s1.toCharArray());

    }

    public String reverse(String input) {
        if(input==null) return "";
        else if(input.length()==1) return input;

        return input.substring(input.length()-1,input.length())+reverse(input.substring(0,input.length()-1));
    }


    public void reverseString(char[] s) {

        //Input: ["h","e","l","l","o"]
        //Output: ["o","l","l","e","h"]
        // swap first and last element


        if(s==null) return;

        reverseString(s,0,s.length-1);
        System.out.println("reverse ->"+new String(s));
    }


    public void reverseString(char[] a, int startIndex,int endIndex) {
        if(startIndex>=endIndex) return;

        char c=a[startIndex];
        a[startIndex]=a[endIndex];
        a[endIndex]=c;
        reverseString(a,startIndex+1,endIndex-1);
    }
}
