import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class TwoStackPathSum {
    public boolean hasPathSum(TreeNode root, int sum) {
        //checkPathSum(root,sum,0);
        
        //[5,4,8,11,null,13,4,7,2,null,null,null,1]
        //22
        if(root==null) return false;
        Stack<TreeNode> stack =new Stack<>();
        Stack<Integer> sumStack =new Stack<>();
        stack.push(root);
        sumStack.push(0);
        int calSum=0;
        while(true) {
            if(!stack.isEmpty()) {
                //System.out.println("stack-->"+stack +" sumStack -->"+sumStack);
            TreeNode node=stack.pop();
            int pre=sumStack.pop();
            sumStack.push(pre);    
            sumStack.push(node.val+pre);
            if(node.right==null && node.left==null) {
                //leaf and sum is required sum then return truel
                int val=sumStack.pop();
                if(val==sum) return true;
            }
                
           if(node.right!=null) stack.push(node.right);
           if(node.left!=null) stack.push(node.left)    ; 
        } else {
            return false;
            }
    }
    }
    
    
}
