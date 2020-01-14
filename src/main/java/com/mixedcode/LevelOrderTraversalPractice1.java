package com.mixedcode;

import java.util.ArrayList;
import java.util.List;
public class LevelOrderTraversalPractice1 {


    private class TreeNode{
        private int val;
        TreeNode left;
        TreeNode right;
        public TreeNode(int _val) {
            this.val=_val;
            left=null;
            right=null;
        }

    }

    /**
     *
     * @param node
     * @return
     *
     *
     * find the height of the tree
     * traverse the tree from root to height
     */
    public List<List<Integer>> levelOrder(TreeNode node) {
        if(node==null) {
            return new ArrayList<>();
        }

        int height=height(node);
        int level=0;
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<height;i++) {
            result.add(getNodesAtALevel(node,i+1));
        }

        return result;
    }


    List<Integer> getNodesAtALevel(TreeNode node,int level) {
        if(node==null) return new ArrayList<>();
        else {
            //check root
            List<Integer> result=new ArrayList<>();
            if(level==1) { //if root
                result.add(node.val);
            } else {
                result.addAll(getNodesAtALevel(node.left,level-1));
                result.addAll(getNodesAtALevel(node.right,level-1));

            }
    return result;
        }

    }

    /**
     *
     * @param node
     * @return
     *
     * if node==null return 0
     *
     * else {
     *     if(level==1){
     *         return 1
     *     } else {
     *         int lHeight=height(node.left)
     *         int rHeight=height(node.right)
     *         if(lHeight>rheight){
     *             return lHeight+1;
     *         else
     *              return rHeight+1;
     *         }
     *     }
     *
     *
     *
     *
     * }
     *
     */


    private int height(TreeNode node) {
        if (node == null) return 0;
        else {
            int lHeight = height(node.left);
            int rHeight = height(node.right);

            if (lHeight > rHeight) {
                return lHeight + 1;
            }
            else
                return rHeight + 1;
            }

        }



    public  void Callmain() {
        LevelOrderTraversalPractice1.TreeNode node = new LevelOrderTraversalPractice1.TreeNode(3);
        node.left=new LevelOrderTraversalPractice1.TreeNode(9);
        LevelOrderTraversalPractice1.TreeNode firstRightChild=new LevelOrderTraversalPractice1.TreeNode(20);
        firstRightChild.left=new LevelOrderTraversalPractice1.TreeNode(15);
        firstRightChild.right=new LevelOrderTraversalPractice1.TreeNode(8);
        node.right=firstRightChild;
        //List<List<Integer>> result=levelOrderFinal(node);

        List<List<Integer>> result=levelOrder(node);
        System.out.println("height : "+height(node));

        for(List<Integer> row:result) {
            System.out.println(row);
        }

    }

    public static void main(String[] args) {
        LevelOrderTraversalPractice1 lot=new LevelOrderTraversalPractice1();
        lot.Callmain();

    }



    }



