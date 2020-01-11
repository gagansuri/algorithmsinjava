package com.passion.study.coursera.algorithms.part1.unionfind;

public interface QuickUnionInterface {

    boolean connected(int p,int q);

    void union(int p, int q);

    void printNodes();

}
