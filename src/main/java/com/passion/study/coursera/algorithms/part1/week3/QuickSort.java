package com.passion.study.coursera.algorithms.part1.week3;

public class QuickSort {

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

    public static int partition(int a[], int low,int high) {
        int i=low;int j=high+1;
        while(true) {
            while(a[++i]<a[low])
                if(i==high) break;

            while(a[--j]>a[low])
                if(j==low) break;
            //swap()
            //pointer cross break

            if(i>=j) break;
            int temp=a[i];
            a[i]=a[j];
            a[j]=temp;
        }


        /*
        *
        *
        *
        * all the items to the left of a[i] are smaller than a[low]
        * and to the right are larger than a[low]
        *
        * move a[low] to a[i]
        */
//exchange a[low] with a[j]
        int temp = a[low];
        a[low]=a[j];
        a[j]=temp;
        return j;

    }

public static void quicksort(int a[],int low,int high) {
        if(low>=high) return;
        int j=partition(a,low,high);
        quicksort(a,low,j-1);
        quicksort(a,j+1,high);
}

    public static void main(String[] args) {
        int a[]={7,5,3,9,6,8,9,11,12,15};
        quicksort(a,0,9);
        for(int i=0;i<10;i++) {
            System.out.print(a[i] +" ");

        }
    }
}
