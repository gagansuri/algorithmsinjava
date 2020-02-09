package com.mixedcode;

import java.util.*;

public class TwoSum {


    public static boolean twoSum(int a[], int k) {
        Set<Integer> numbers = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            if (numbers.contains(k - a[i])) return true;
            else numbers.add(a[i]);
        }
            return false;
    }


    public static void main(String[] args) {
        int a[]={2,3,5,7,9,4,8};

        System.out.println("result->"+ twoSum(a,4));
    }
}
