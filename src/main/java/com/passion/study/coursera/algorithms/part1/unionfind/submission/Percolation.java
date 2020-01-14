package com.passion.study.coursera.algorithms.part1.unionfind.submission;

import edu.princeton.cs.algs4.WeightedQuickUnionUF;

/**
 *
 *
 *  1. Keep two data structures, one 2d array with size n by n and another weightedUF with arraysize equal to N*N+2
 *
 *  2. initialize the 2d array - grid[][] with all false i.e not open or 0 for int
 *
 *  3. keep the state of open in both grid and weightedUF array
 *
 *  4. for open(row,col)  call 4 operations of uf union and set grid[row-1] [col-1] to true i.e open
 *      if open is for row = 1, then set the virtual top uf array [0] to connected
 *
 *      if open is for row = n, then set the virtual bottom of ef array [N*N+1] to connected by calling union(0,
 *
 *  5. for isOpen(row,col) return grid[row-1][col-1]
 *
 *  6. for isFull(row,col) return grid[row-1][col-1]
 *
 *  7. for percolates return uf.isConnected(0,N*N+1) to check if the virtual top and virtual bottom are connected
 */

public class Percolation {
    private final WeightedQuickUnionUF uf;
    // creates n-by-n grid, with all sites initially blocked
    //blocked = 1
    private final int N;
    private boolean[][] grid;

    private int openSites=0;
    public Percolation(int n) {
        this.N=n;
        uf=new WeightedQuickUnionUF(n*n+2);
        grid=new boolean[N][N];
    }


    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        if(grid[row-1][col-1]==false) {
            grid[row - 1][col - 1] = true;
            openSites++;
        }

        if(row==1) {
            uf.union(getIndex(row,col),0);
        }
        if(row==N) {
            uf.union(getIndex(row,col),N);
        }


        //left
        if(col>1) {
            uf.union(getIndex(row,col),getIndex(row,col-1));
        }
        if(col<this.N) {
        //right
            uf.union(getIndex(row,col),getIndex(row,col+1));
        }
        if(row>0) {
        //top
            uf.union(getIndex(row,col),getIndex(row-1,col));
        }

        //bottom
        if(row<this.N) {
            uf.union(getIndex(row,col),getIndex(row+1,col));
        }

    }


    private int getIndex(int row,int col){
        return (row-1)*this.N+(col);
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        checkBoundary(row,col);
        return grid[row-1][col-1];

    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        checkBoundary(row,col);
        return grid[row-1][col-1];
    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return this.openSites;
    }

    // does the system percolate?
    public boolean percolates() {
        return uf.connected(0,N*N+1);
    }

    // test client (optional)
    public static void main(String[] args) {

    }

    private void checkBoundary(int row,int col) {
        if(row<1|| row>N || col<1 || col>N) throw new IllegalArgumentException("illegal input");
    }
}