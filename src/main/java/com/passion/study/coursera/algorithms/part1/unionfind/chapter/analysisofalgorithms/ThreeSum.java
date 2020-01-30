package com.passion.study.coursera.algorithms.part1.unionfind.chapter.analysisofalgorithms;

import java.util.*;
import java.util.Random;

public class ThreeSum {

    /**
     * brute force
     */
    public int threesum(int[] arr, int sum) {
        int count=0;
        for(int i=0;i<arr.length;i++) {
            for(int j=i+1;j<arr.length;j++) {
                for(int k=j+1;k<arr.length;k++) {
                    System.out.println(arr[i]+arr[j]+arr[k]);
                    if(arr[i]+arr[j]+arr[k]==sum) {
                        count++;
                    }
                }
            }
        }
        return count;

    }


    public int threesumOptimized(int[] arr, int sum) {
        int count=0;
        int[] twosum=new int[2];
        List<int[]> summationList= new ArrayList<>();
        for(int i=0;i<arr.length-1;i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int[] l=new int[3];
                l[0]=arr[i]+arr[j];
                l[1]=i;
                l[2]=j;
                summationList.add(l);
            }
        }



        return count;

    }


    public static void main(String[] args) {
        int[] arr={3,4,5,6,7,8,9,10,11,12};
        ThreeSum th=new ThreeSum();
        for(int i=0;i<1;i++) {
            int sum = getRandomNumberInRange(12,33);
            int c1 = th.threesumOptimized(arr, sum);
            int c = th.threesum(arr, sum);
            System.out.println("sum-> "+sum+" c1-> " + c1 + " c->" + c);

        }
    }

    private static int getRandomNumberInRange(int min, int max) {

        if (min >= max) {
            throw new IllegalArgumentException("max must be greater than min");
        }

        Random r = new Random();
        return r.nextInt((max - min) + 1) + min;
    }

}
