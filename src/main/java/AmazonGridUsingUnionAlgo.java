public class AmazonGridUsingUnionAlgo {


    private int[][] grid;
    private int[] connectionGrid;
    private int rows,columns;
    public AmazonGridUsingUnionAlgo(int __rows,int __cols) {
        grid=new int[__rows][__cols];
        connectionGrid=new int[__rows + __cols];
        for(int i=0;i<__rows+__cols;i++) {
            connectionGrid[i]=i+1;
        }
    }


    //only if row, col ==1
    public void connect(int row,int col) {
        //row 3, col 2
        // row-1*col+col

        int left=col-1;
        int right=col+1;
        int top=row-1;
        int bottom=row+1;



        int[] neighbors=getNeighbours(row,col);
        //int[] mainGridNeighbors=getMainNeighbors(row,col);

        for(int i=0;i<neighbors.length;i++) {
            //if the item has already some other root then use that
            //otherwise make the current element the root
            if(connectionGrid[i]==i) {

            }


        }

       /* if(connectionGrid[value]==value) {
            //no root
            //connect neighbors
        }
*/
    }


    private int root(int row,int col) {

        return connectionGrid[row];
    }



    private int getGridIndex(int row,int col) {
        return (row-1)*col+ (col-1);
    }


    private int getRoot(int row,int col) {
        int index=getGridIndex(row,col);
        return connectionGrid[index];
    }

    private int[] getNeighbours(int row,int col) {
        //if top row then only left and right
        int[] indexes=new int[5];
        int i=0;
        //top
        if(row!=0) {
            indexes[i++]=getGridIndex(row-1,col);
        }
        //bottom
        if(row!=this.rows-1) {
            indexes[i++]=getGridIndex(row+1,col);
        }

        //left
        if(col!=0) {
            indexes[i++]=getGridIndex(row,col-1);
        }
        //right
        if(col!=this.columns-1) {
            indexes[i++]=getGridIndex(row,col+1);
        }

        return indexes;

    }
}
