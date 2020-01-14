package com.mixedcode;

/**
 * COST MODEL
 * Initialize = N
 * union = N
 * find = 1
 */

public class UnionFind {
    private int numberOfNodes;
    private int[] id;
    public UnionFind(int n) {
        this.numberOfNodes=n;
        id=new int[n];
        for(int i=0;i<n;i++) {
            id[i]=i;
        }
    }

    public void union(int p, int q) {
        //change the value from p to q
        int pid=id[p];
        int qid=id[q];

        for(int i=0;i<this.numberOfNodes;i++) {
            if(id[i]==pid ) {
                id[i]=qid;
            }
        }
    }

    public boolean isConnected(int p, int q) {
        return id[p]==id[q];
    }

    public void printNodes(){
        for(int i=0;i<numberOfNodes;i++) {
            System.out.print(id[i] + " ");
        }
    }
}
