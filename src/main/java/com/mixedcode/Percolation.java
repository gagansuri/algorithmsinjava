/*
import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.StdStats;
import edu.princeton.cs.algs4.WeightedQuickUnionUF;

public class Percolation {

    private int[][] grid;
    private int openSitesCount;
    private int gridSize;
    private int top = 0; // virtual top
    private int bottom; // virtual bottom
    private WeightedQuickUnionUF weightedQuickUnionUF; // a WeightedQuickUnionUF instance

    // creates n-by-n grid, with all sites initially blocked
    public Percolation(int n) {
        grid=new int[n][n];
        this.gridSize=n;
        openSitesCount=0;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                grid[i][j]=1; //1 is blocked //0 is open
            }
        }
        // grid is saved as rows connected to each other one after the other
        // so for ith row and jth column in the grid, the element position in the array is calculated by
        // N*(i-1) + j columns

        weightedQuickUnionUF =new WeightedQuickUnionUF((this.gridSize*this.gridSize)+2); //1 top and 1 bottom virtual roots



    }

    //
    private void checkValidInput(int row,int col) {
        if(row<1 || col<1 || row>this.gridSize || col>this.gridSize) {
            throw new IllegalArgumentException("Illegal values for row or column");
        }
    }

    private int getIndexOfRowColumnInGrid(int row,int col) {
        return gridSize*(row-1)+col;
    }

    // opens the site (row, col) if it is not open already
    public void open(int row, int col) {
        checkValidInput(row,col);
        //open the site
        grid[row-1][col-1]=0;

        // for first row connect everything to top virtual
        if(row==1) {
            weightedQuickUnionUF.union(getIndexOfRowColumnInGrid(row,col),top);
        }

        //for last row connect everything to the bottom
        if(row==gridSize) {
            weightedQuickUnionUF.union(getIndexOfRowColumnInGrid(row,col),bottom);
        }

        //join possible neighbors
        // say join  row =3, col = 2
        // that will result in all adjacent cells to join row-1, row+1 and col-1 and col+1
        // union possible neighbor(s)
        if (row > 1 && isOpen(row - 1, col)) {
            weightedQuickUnionUF.union(getIndexOfRowColumnInGrid(row, col), getIndexOfRowColumnInGrid(row - 1, col));
        }
        if (row < gridSize && isOpen(row + 1, col)) {
            weightedQuickUnionUF.union(getIndexOfRowColumnInGrid(row, col), getIndexOfRowColumnInGrid(row + 1, col));
        }
        if (col > 1 && isOpen(row, col - 1)) {
            weightedQuickUnionUF.union(getIndexOfRowColumnInGrid(row, col), getIndexOfRowColumnInGrid(row, col - 1));
        }
        if (col < gridSize && isOpen(row, col + 1)) {
            weightedQuickUnionUF.union(getIndexOfRowColumnInGrid(row, col), getIndexOfRowColumnInGrid(row, col + 1));
        }


        this.openSitesCount++;
    }

    // is the site (row, col) open?
    public boolean isOpen(int row, int col) {
        checkValidInput(row,col);
        return grid[row-1][col-1]==0;
    }

    // is the site (row, col) full?
    public boolean isFull(int row, int col) {
        checkValidInput(row,col);
        this.openSitesCount--;
        return grid[row-1][col-1]==1;

    }

    // returns the number of open sites
    public int numberOfOpenSites() {
        return this.openSitesCount;
    }

    // does the system percolate?
    public boolean percolates() {

        return weightedQuickUnionUF.connected(top, bottom);
    }

    // test client (optional)
    public static void main(String[] args) {

    }
}*/
