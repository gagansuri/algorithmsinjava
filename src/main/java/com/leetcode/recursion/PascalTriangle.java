package com.leetcode.recursion;


import java.util.*;

public class PascalTriangle {

    public static void main1(String[] args) {
        for(int i=0;i<6;i++) {
            for(int j=0;j<i;j++) {
                System.out.print(j+1 +"  ");
            }
            System.out.print("1");
            System.out.println();
        }
    }


    public static void main(String args[]){
        pascalTriangle(5);


    }


    private void pascalTriangleRecursive(int numRows) {
        List<List<Integer>> table = new ArrayList<>();

        //table.addAll()

    }

    private static void pascalTriangle(int numOfRows) {
        List<List<Integer>> table =new ArrayList<>();
        List<Integer> row;
        for(int i=0;i<numOfRows;i++) {
            row=new ArrayList<>();
            for(int j=0;j<i;j++) {
                if(j==0) {
                    row.add(j + 1);
                } else {
                    row.add(table.get(i-1).get(j-1)+table.get(i-1).get(j));
                }
            }
            row.add(1);
            table.add(row);
        }
        System.out.println(table);
    }


}


/*
a[0]=  1
      1  1
    1  2   1
  1  3  3  1
*/

