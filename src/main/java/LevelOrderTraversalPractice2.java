import java.util.*;

public class LevelOrderTraversalPractice2 {

 class Node{
    private int val;
    public Node(int __val) {
        this.val=__val;
    }

    public Node left;
    public Node right;
}


public List<List<Integer>> levelOrderTraversal(Node root) {
    if(root==null) return new ArrayList<>();


    int height=height(root);
    List<List<Integer>> result=new ArrayList<>();
    for(int i=0;i<height;i++) {
        result.add(getNodelAtALevel(root,i+1));
    }

    return result;
}


private int height(Node node) {
    System.out.println(node.val);
    if(node==null) return 0;
    else {
        int leftHeight=height(node.left);
        int rightHeight=height(node.right);
        if(leftHeight>rightHeight) {
            return leftHeight+1;
        } else {
            return rightHeight+1;
        }
    }
}


private List<Integer>  getNodelAtALevel(Node node, int level) {

    if(node==null) return new ArrayList<>();
    else {
        List<Integer> result=new ArrayList<>();
        if(level==1) {
            result.add(node.val);
        } else {
            result.addAll(getNodelAtALevel(node.left,level-1));
            result.addAll(getNodelAtALevel(node.right,level-1));
        }
return result;
    }



}

}
