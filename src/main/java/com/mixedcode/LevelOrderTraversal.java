package com.mixedcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */



public class LevelOrderTraversal {

    private class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x;
        left=null;
        right=null;}
    }



    public List<List<Integer>> levelOrder(TreeNode root) {
        if(root==null) return new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> res=null;
        int level=1;

        while(queue.isEmpty()==false) {
            res=new ArrayList<>();
            for(int i=1;i<=Math.pow(2,level-1);i++) {
                if(queue.isEmpty()==false) {
                    TreeNode node=queue.remove();
                    if(node!=null) {
                        res.add(node.val);
                    }
                    if(node!=null && node.left!=null) {
                        queue.add(node.left);
                    }
                    if(node!=null && node.right!=null) {
                        queue.add(node.right);
                    }
                }


            }
            level++;
            result.add(res);
        }


        return result;
    }


    private List<List<Integer>> levelOrder1(TreeNode root) {
        if(root==null) return new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> res=null;

        TreeNode nodeLeft=queue.remove();
            TreeNode nodeRight=null;
            res=new ArrayList<>();
            res.add(nodeLeft.val);

            if(queue.isEmpty()==false) {
                nodeRight = queue.remove();
                res.add(nodeRight.val);
            }

            if(nodeLeft!=null) {
                if(nodeLeft.left!=null)
                    queue.add(nodeLeft.left);
                if(nodeLeft.right!=null)
                    queue.add(nodeLeft.right);
            }

            if(nodeRight!=null && nodeRight.left!=null){
                queue.add(nodeRight.left);
            }
            if(nodeRight!=null && nodeRight.right!=null){
                queue.add(nodeRight.right);
            }
        result.add(res);
            return null;
        }




    private List<List<Integer>> levelOrderFinal(TreeNode root) {
        if(root==null) return new ArrayList<>();

        Queue<TreeNode> queue=new LinkedList<>();
        queue.add(root);

        List<List<Integer>> result=new ArrayList<>();
        List<Integer> res=null;
        int level=0;
        while(!queue.isEmpty()) {
            Queue<TreeNode> queueAtLevel=new LinkedList<>();
            res=new ArrayList<>();

            for(int i=0;i<Math.pow(2,level);i++) {

                if (!queue.isEmpty()) {
                    TreeNode node = queue.remove();
                    res.add(node.val);

                    if (node.left != null) {
                        queueAtLevel.add(node.left);
                    }

                    if (node.right != null) {
                        queueAtLevel.add(node.right);
                    }
                }
            }

            queue.addAll(queueAtLevel);
            result.add(res);
            level++;



        }

        return result;


}



    private List<List<Integer>> levelOrderFinalRecursive(TreeNode root) {
        if(root ==null) return new ArrayList<>();
        int height=height(root);
        List<List<Integer>> result=new ArrayList<>();
        for(int i=0;i<height;i++) {
            result.add(printGivenLevel(root, i+1));
        }

        return result;

    }

    List<Integer> printGivenLevel(TreeNode node,int level) {
        if(node==null) return new ArrayList<>();
        List<Integer> row=new ArrayList<>();
        /*for(int i=0;i<level;i++) {
            row.addAll(node.val);
        }*/
        if(level==1) {
            row.add(node.val);
        } else {
            row.addAll(printGivenLevel(node.left,level-1));
            row.addAll(printGivenLevel(node.right,level-1));
        }
return row;

    }

    private int height(TreeNode node) {
        if(node==null) {
            return 0;
        }
        else {
            int lheight = height(node.left);
            int rheight = height(node.right);
            if(lheight>rheight) {
                return lheight+1;
            } else {
                return rheight+1;
            }

        }
    }





    public  void Callmain() {
        TreeNode node = new TreeNode(3);
        node.left=new TreeNode(9);
        TreeNode firstRightChild=new TreeNode(20);
        firstRightChild.left=new TreeNode(15);
        firstRightChild.right=new TreeNode(7);
        node.right=firstRightChild;
        //List<List<Integer>> result=levelOrderFinal(node);

        List<List<Integer>> result=levelOrderFinalRecursive(node);
        System.out.println("height : "+height(node));

        for(List<Integer> row:result) {
            System.out.println(row);
        }

    }

    public static void main(String[] args) {
        LevelOrderTraversal lot=new LevelOrderTraversal();
        lot.Callmain();

    }
}
