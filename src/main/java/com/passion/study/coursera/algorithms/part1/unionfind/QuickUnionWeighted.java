package com.passion.study.coursera.algorithms.part1.unionfind;

public class QuickUnionWeighted implements QuickUnionInterface {

    private int[] id;
    private int N;
    private int size[];
    public QuickUnionWeighted(int n) {
        id=new int[n];
        this.N=n;

        for(int i=0;i<this.N;i++) {
            id[i]=i;
            size[i]=1;
        }


    }

    @Override
    public boolean connected(int p, int q) {
        return root(p)==root(q);
    }

    @Override
    public void union(int p, int q) {
            int rootP=root(p);
            int rootQ=root(q);
            //change id of p
            if(rootP==rootQ) return;

            if(size[rootP]<size[rootQ]) {
                id[rootP]=id[rootQ];
                size[rootQ]=size[rootQ]+size[rootP];
            } else {
                id[rootQ]=id[rootP];
                size[rootP]+=size[rootQ];
            }



            //if size of tree at p is smaller then changes id[p]
    }

    @Override
    public void printNodes(){
        for(int i=0;i<this.N;i++) {
            System.out.print(id[i] + " ");
        }
    }


    private int root(int p) {
        int i=p;
        while(i!=id[i]) {
            i=id[i];
        }
        return i;
    }

}
