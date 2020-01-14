package com.leetcode.problems.easy;

public class SortedArraysMedian {

    public static void main(String[] args) {
        int nums1[]=new int[]{1,2};
        int nums2[]= new int[]{3,4};

        nums1=new int[]{1,3};
        nums2= new int[]{2};


        SortedArraysMedian sortedArraysMedian =new SortedArraysMedian();
        double result=sortedArraysMedian.findMedianSortedArrays(nums1,nums2);
        System.out.println("Median -> "+result);
    }

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int numsC[]=new int[nums1.length+nums2.length];
        int i=0,j=0,k=0;
        int minCount=nums1.length<nums2.length?nums1.length:nums2.length;
        for(;(i<nums1.length && j<nums2.length);k++) {
            if(nums1[i]<nums2[j]) {
                numsC[k]=nums1[i++];
            } else {
                numsC[k]=nums2[j++];
            }
        }

        for(;i<nums1.length;i++) {
            numsC[k++]=nums1[i];
        }


        for(;j<nums2.length;j++) {
            numsC[k++]=nums2[j];
        }

        double result;
        int numsCLength=numsC.length;
        if(numsCLength %2==0) {
            // len = 4, [1,2,3,4] len/2 = 2 arr[2-1] arr[2]
            result = (numsC[numsCLength/2-1] + numsC[numsCLength/2])/2.0;
        } else {
            result= (double)numsC[numsCLength/2];
        }

        return result;

    }
}
