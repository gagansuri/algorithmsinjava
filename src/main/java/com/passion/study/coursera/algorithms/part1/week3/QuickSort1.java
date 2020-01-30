package com.passion.study.coursera.algorithms.part1.week3;

public class QuickSort1 {





    public static void main(String[] args) {
        int a[]={7,5,3,9,6,8,9,11,12,15};
        quicksort(a,0,9);
        for(int i=0;i<10;i++) {
            System.out.print(a[i] +" ");

        }
    }


    public static void quicksort(int a[],int low,int high) {
        if(low>=high) return;

        int j=partition(a,low,high);
        quicksort(a,low,j-1);
        quicksort(a,j+1,high);

    }


    public static int partition(int a[],int low, int high) {
        // make array a such that there is a partition index such that all the elements on the left are smaller than the element on j
        // and all the elements to the right are greater than the element at partition index
        int i=low; int j=high+1;
        while(true) {


            // while a[i] less than a[low] i++
            while(a[++i]<a[low])
                if(i>=high) break;

            while(a[--j]>a[low])
                if(j<=low) break;

            // now we have found i and j
            /**
             * everything to left of i is smaller than low and everything to right of j is larger
             * exchange low and j
             */
            // if i and j cross break
            if(i>=j) break;
            exchange(a,i,j);

        }

        exchange(a,low,j);
        return j;
    }

    public static void exchange(int[] a, int i, int j) {
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
}
