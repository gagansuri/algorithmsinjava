package com.passion.study.coursera.algorithms.part1.unionfind.practice;

/**
 * Quick Union introduces the concept of root
 */
public class WeightedQuickUnion {

    int id[];
    int N;
    int size[];

    public WeightedQuickUnion(int n) {
        id=new int[n];
        size=new int[n];
        this.N=n;

        for(int i=0;i<this.N;i++) {
            id[i]=i;
            size[i]=1;
        }
    }

    public void union(int p,int q){
        //this is quickunion so the root of p will be set to root of q
        int rootP=root(p);
        int rootQ=root(q);

        if(rootP==rootQ) return;

        //the lower size tree is joined to the larger size tree
        if(size[rootP]<size[rootQ]) {
            id[rootP]=rootQ;
            size[rootQ]+=size[rootP];
        } else {
            id[rootQ]=rootP;
            size[rootP]+=rootQ;
        }


    }




    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    private int root(int p) {
        while(p!=id[p]) {
            id[p]=id[id[p]];
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
