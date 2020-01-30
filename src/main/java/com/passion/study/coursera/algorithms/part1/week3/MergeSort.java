package com.passion.study.coursera.algorithms.part1.week3;

import java.util.Arrays;

public class MergeSort {


    //public static void merge(Comparable a[],Comparable aux[],int low,int mid,int high) {


    public static void main(String[] args) {
        int a[]={8,9,10,12,16,2,4,6,8,10,19,16,12,15,25,27,30,32,34,70,75,78,79,51,54,56,59,91,87,92,85,101,105,99};
        //int a[]={2,4,6,8,10,8,9,10,12,16};

        int[] aux=new int[10];
        //merge(a,aux,0,4,10);
        sort1(a,aux,0,a.length-1);
        for(int i=0;i<10;i++) {
            System.out.print(a[i] +" ");

        }
    }


    private void sort(int[]a) {

            int[] aux=new int[a.length];

            sort(a,aux,0,a.length-1);
    }

    private void sort(int a[],int aux[],int low,int high) {
            if(low==high) return;

            int mid=low+(high-low)/2+1;
            sort(a,aux,low,mid);
            sort(a,aux,mid+1,high);
            merge(a,aux,low,mid,high);
    }



    private static void sort1(int array[],int aux[],int low,int high) {

            if(high<=low) return;
            int mid=low+(high-low)/2;
            sort1(array,aux,low,mid);
            sort1(array,aux,mid+1,high);
            merge(array,aux,low,mid,high);
    }

    public static void merge(int a[],int aux[],int low,int mid,int high) {
        //the lower half low to mid and mid+1 to high are sorted
        for(int i=low;i<=high;i++) {
            aux[i]=a[i];
        }

        int i=low, j=mid+1;

        for(int k=low;k<=high;k++) {
            //System.out.println(" i ->"+i +" a[i] -> "+a[i] +" j-> "+j +" a[j]-> "+a[j]);
            if(i>mid) {
                a[k]=aux[j++];
            }

            else if(j>high) {
                a[k]=aux[i++];
            }
            else if(aux[i]<=aux[j]) {
                a[k]=aux[i++];
            } else if(aux[j]<aux[i]) {
                a[k]=aux[j++];

            }
        }
    return ;
    }


    static int CUTOFF=7;
    public static void improvedMergeSort(int[] a, int aux[],int low,int high) {
        if(high-low+1<CUTOFF) {
            //insertionsort.sort(a,low,high);
            Arrays.sort(a);
            return;
        }
        int mid=low+(high-low)/2;
        sort1(a,aux,low,mid);
        sort1(a,aux,mid+1,high);
        if(a[mid]<=a[mid+1]) {
            return;
        }
        merge(a,aux,low,mid,high);

    }



    public static void itMergeSort(int a[]) {

    }

}
