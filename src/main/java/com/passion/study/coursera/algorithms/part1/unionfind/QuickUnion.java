package com.passion.study.coursera.algorithms.part1.unionfind;

public class QuickUnion {

    private int[] id;
    private int N;

    public QuickUnion(int n) {
        id=new int[n];
        this.N=n;

        for(int i=0;i<this.N;i++) {
            id[i]=i;
        }
    }



    public boolean connected(int p,int q) {
        return root(p)==root(q);
    }

    public void union(int p, int q) {
        id[p]=id[q];
    }

    private int root(int p) {
        while(id[p]!=p) {
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
