package com.mixedcode;

import java.util.List;

public class LevelOrderTraversalClient {


    public  void Callmain() {
        LevelOrderTraversalPractice2.Node node = new LevelOrderTraversalPractice2(). new Node(3);


        node.left=new LevelOrderTraversalPractice2().new Node(9);
        LevelOrderTraversalPractice2.Node firstRightChild=new LevelOrderTraversalPractice2().new Node(20);
        firstRightChild.left=new LevelOrderTraversalPractice2().new Node(15);
        firstRightChild.right=new LevelOrderTraversalPractice2().new  Node(8);
        node.right=firstRightChild;
        //List<List<Integer>> result=levelOrderFinal(node);

        List<List<Integer>> result=new LevelOrderTraversalPractice2().levelOrderTraversal(node);


        for(List<Integer> row:result) {
            System.out.println(row);
        }

    }

    public static void main(String[] args) {
        LevelOrderTraversalPractice1 lot=new LevelOrderTraversalPractice1();
        lot.Callmain();

    }


}
