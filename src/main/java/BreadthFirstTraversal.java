import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {


    class TreeNode {
      int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
 }



    public List<List<Integer>> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if(root==null) {
            return new ArrayList<>();
        }

        List<List<Integer>> result=new LinkedList<>();
        queue.add(root);
        while(!queue.isEmpty()) {
            TreeNode left=root.left;
            TreeNode right=root.right;
            if(left!=null) {

            }
        }

        //result.add(root.val);
    return null;
    }


    public int numIslands(char[][] grid) {
        int numberofIslands=0;
        for(int i=0;i<grid.length;i++ ) {
            for(int j=0;j<grid[i].length;j++) {
                if(grid[i][j]=='1') {
                    numberofIslands+=dfs(grid,i,j);

                }

            }


        }
    return numberofIslands;
    }


    private int dfs(char[][]grid, int row, int col) {
        if(row<0|| row>=grid.length|| col>grid[row].length|| col<0 || grid[row][col]=='0')
            return 0;
        //set the current to zero and count it
        grid[row][col]='0';

        //above row same col

        dfs(grid,row-1,col);
        //below row
        dfs(grid,row+1,col);

        //left col
        dfs(grid,row,col-1);

        //right col
        dfs(grid,row,col+1);

        return 1;


    }



}
