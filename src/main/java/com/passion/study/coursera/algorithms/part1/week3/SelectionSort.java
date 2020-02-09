package com.passion.study.coursera.algorithms.part1.week3;

public class SelectionSort {

//

    public static void main(String[] args) {
        int a[]={8,9,10,12,16,2,4,6,8,10,19,16,12,15,25,27,30,32,34,70,75,78,79,51,54,56,59,91,87,92,85,101,105,99};
        //int a[]={2,4,6,8,10,8,9,10,12,16};

        int[] aux=new int[10];
        //merge(a,aux,0,4,10);
        sort(a);
        for(int i=0;i<a.length;i++) {
            System.out.print(a[i] +" ");

        }
    }


    public static void sort(int a[]) {

        // select the min in each iteration
        int n=a.length;
        for(int i=0;i<n;i++) {
            int min=i;
            for(int j=i+1;j<n;j++) {
                if(a[j]<a[min]) {
                    min=j;
                }
            }
            swap(a,min,i);
        }
    }


    public static void swap(int a[],int i,int j) {

        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
        return;
    }
}
