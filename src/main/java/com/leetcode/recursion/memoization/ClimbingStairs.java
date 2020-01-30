package com.leetcode.recursion.memoization;

import java.util.*;

public class ClimbingStairs {
    public static void main(String[] args) {
        new ClimbingStairs().climbStairs(38);
    }

        public int climbStairs(int n) {
            Map<Integer,Integer> calculationMap=new HashMap<>();
            if(calculationMap.get(n)!=null) {
                return calculationMap.get(n);
            }

            if(n==1||n==0) {
                calculationMap.put(1,1);
                calculationMap.put(0,1);
                return 1;
            } else if(n==2)  {
                calculationMap.put(2,2);
                return 2;
            }

            int result=climbStairs(n-1)+climbStairs(n-2);
            calculationMap.put(n,result);
            return result;
        }
    }
