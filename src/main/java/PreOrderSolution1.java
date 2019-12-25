import java.util.*;

public class PreOrderSolution1 {

    class TreeNode {
        int val;
        PreOrderSolution1.TreeNode left;
        PreOrderSolution1.TreeNode right;
        TreeNode(int x) {
            val = x;
        }
    }


        public List<Integer> preorderTraversal(TreeNode root) {
            List<Integer> result;
            if(root==null){
                result=new ArrayList<>();
            }
            result=new ArrayList<>();
            if(root!=null) {
                result.add(root.val);
                result.addAll(preorderTraversal(root.left));
                result.addAll(preorderTraversal(root.right));
            }
            return result;
        }
    }

