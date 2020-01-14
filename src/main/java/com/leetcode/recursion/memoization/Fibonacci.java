package com.leetcode.recursion.memoization;

import java.util.*;

public class Fibonacci {
    Map<Long,Long> calculationMap=new HashMap<>();

    public int fibonacci(int n) {
        if(n<2) return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }


    public static void main(String[] args) {
        Fibonacci fibonacci=new Fibonacci();
        long startTime=System.currentTimeMillis();

        long number=fibonacci.fibonacciMem(50);

        long endTime=System.currentTimeMillis();
        System.out.println(number +" Total Time taken: ->"+ ((endTime-startTime)));
    }


    public long fibonacciMem(int n) {
        if(calculationMap.get(n)!=null) return calculationMap.get(n);
        long result;
        if(n<2) {
            calculationMap.put((long)n,(long)n);
            return n;
        } else {
            result = fibonacciMem(n-1)+fibonacciMem(n-2);
        }

        calculationMap.put((long)n,result);
        return result;

    }
}
