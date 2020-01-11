package com.passion.study.coursera.algorithms.part1.unionfind.practice;

public class QuickFind {

    int id[];
    int N;


    public QuickFind(int n) {
        id=new int[n];
        this.N=n;

        for(int i=0;i<this.N;i++) {
            id[i]=i;
        }
    }

    public void union(int p,int q){
        //change id[p] to q for all
        // extracts ids before since they may change during iteration
        int pId=id[p];
        int qId=id[q];

        for(int i=0;i<N;i++) {
            if(id[i]==pId) {
                id[i]=qId;
            }
        }
    }

    public boolean connected(int p, int q) {
            return id[p]==id[q];
    }

    public void printNodes(){
        for(int i=0;i<this.N;i++) {
            System.out.print(id[i] + " ");
        }
    }


}
