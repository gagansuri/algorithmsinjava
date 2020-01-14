package com.leetcode.problems.easy;

import com.leetcode.recursion.ReverseList;

public class ReverseInteger {


    public int reverse(int x) {
        /*

        1234
        x = x/10 --> 1234/10 = 123
        rem = x%10 --> 1234%10 = 4
        y = 4

        123/10 --> 12
        x = x%10 --> 3
        y = 3



        number*10+3 = 43
        num=0*1+4
        43*10+2 = 432
        432*10 +1 = 4320+1

        */


        long result=0;
        int count=0;
        while(x!=0){
            int rem=x%10;
            x=x/10;
            result = result*10 +rem;
        }

        if(result>Integer.MAX_VALUE || result <Integer.MIN_VALUE) return 0;
        else return (int)result;
    }


    public static void main(String[] args) {
        ReverseInteger reverseInteger= new ReverseInteger();
        int result=reverseInteger.reverse(1534236469);
        System.out.println(result);
    }
}
