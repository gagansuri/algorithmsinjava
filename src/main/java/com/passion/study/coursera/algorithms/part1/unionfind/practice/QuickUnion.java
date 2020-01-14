package com.passion.study.coursera.algorithms.part1.unionfind.practice;

/**
 * Quick Union introduces the concept of root
 */
public class QuickUnion {

    int id[];
    int N;


    public QuickUnion(int n) {
        id=new int[n];
        this.N=n;

        for(int i=0;i<this.N;i++) {
            id[i]=i;
        }
    }

    public void union(int p,int q){
        //this is quickunion so the root of p will be set to root of q
        int rootP=root(p);
        int rootQ=root(q);
        id[rootP]=rootQ;
        }




    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    private int root(int p) {
        while(p!=id[p]) {
            p=id[p];
        }
        return p;
    }

    public void printNodes(){
        for(int i=0;i<this.N;i++) {
            System.out.print(id[i] + " ");
        }
    }


}
