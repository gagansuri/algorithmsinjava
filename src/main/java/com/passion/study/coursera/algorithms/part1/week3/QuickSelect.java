package com.passion.study.coursera.algorithms.part1.week3;

public class QuickSelect {

    /**
     *
     * select a random partition say k=0
     *
     * arrange such that all the elements smaller than a[k] are on the left and all the
     * elements larger than a[k] are on the right of a[k]
     *
     *
     * Repeat until i and j pointers cross.
     * Scan i from left to right so long as (a[i] < a[lo]).
     * Scan j from right to left so long as (a[j] > a[lo]).
     * Exchange a[i] with a[j].
     *
     *
     *
     *
     */




    public static void main(String[] args) {
        int a[]={7,5,3,9,6,8,9,11,12,15};
        int k=10;
        int kthNumber=getKthElement(a,k-1);
        System.out.println(k +" smallest Number -> "+kthNumber );
    }



    private static int getKthElement(int a[],int k) {
        int low=0; int high=a.length-1;

        while(high>low) {
            int j=partition(a,low,high);

            if(k<j) {
                high=j-1;
            } else if(k>j) {
                low=j+1;
            } else {
                return a[k];
            }

        }
        return a[k];

    }



    private static int partition(int a[],int low,int high) {
        //find an element a[j] such that all the elements to the left of a[j] are smaller than = a[j]
        // and all the elements to the right of a[j] are greater than = a[j]

        int i=low; int j=high+1;

        while(true) {
            //low and i are same at first
            while(a[++i] <a[low])
                if(i>=high) break;


            while(a[--j]>a[low])
                if(j<=low) break;


            //swap i and j since at this point a[i] is > = a low and a[j] is less than a[low]
            // so a[i] should be left of a[low] and a[j] should be right of a[low]

            // exit out if i and j cross over
            if(i>=j) break;

            exchange(a,i,j);
        }

        //now exchange low and j since j is the position where a[low] should be and return the partitionindex j
        exchange(a,low,j);
        return j;
    }


    public static void exchange(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
