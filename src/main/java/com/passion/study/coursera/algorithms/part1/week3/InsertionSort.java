package com.passion.study.coursera.algorithms.part1.week3;

public class InsertionSort {

    public static void main(String[] args) {
        int a[] = {7, 5, 3, 9, 6, 8, 9, 11, 12, 15};
        insertionsort(a, 0, 9);

    }

        public static void insertionsort(int a[],int low,int high) {
        int swapcount=0;
        int iterationCount=0;
            for(int i=0;i<a.length-1;i++) {
                for(int j=i+1;j>0;j--) {
                    iterationCount++;
                    if(a[j]<a[j-1]){
                        swap(a,j,j-1);
                        swapcount++;
                        printA(a);
                    }

                }
            }

            System.out.println("swapcount -> "+swapcount+" iterationcount -> "+iterationCount);
        }


        private static void swap(int a[],int i,int j) {
                int temp =a[i];
                a[i]=a[j];
                a[j]=temp;
        }

        private static void printA(int a[]) {
            for (int i = 0; i < 10; i++) {
                System.out.print(a[i] + " ");
            }
            System.out.println();
        }

}
