public class TreeNode {


    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int x) {
        val = x;
    }

//pre order traversal
// node, left, right
    public TreeNode createTree() {
       // int[] elements={5,4,8,11,null,13,4,7,2,null,null,null,1};

    /*    TreeNode root=new TreeNode(5);
        for(int i=1;i<10;i++) {
            TreeNode l=new TreeNode(elements[i]);
            TreeNode r=new TreeNode(elements[i+1]);
            root.left=l;
            root.right=r;
        }*/

    /*
      5             root
     / \
    4   8           first left and first right
   /   / \
  11  13  4         first left and first right
 /  \      \
7    2      1
     */


        TreeNode root = new TreeNode(5);

        TreeNode firstLeftChild_4=new TreeNode(4);
        TreeNode firstRightChild_8=new TreeNode(8);

        TreeNode secondLeftChild_11=new TreeNode(11);

        TreeNode thirdLeftLeftChild_7 = new TreeNode(7);
        TreeNode thirdLeftRightChild_2 = new TreeNode(2);

        TreeNode secondRightLeftChild_13=new TreeNode(13);
        TreeNode secondRightRightChild_4=new TreeNode(4);

        TreeNode thirdRightRightChild1 = new TreeNode(1);

        root.left=firstLeftChild_4;
        root.right=firstRightChild_8;

        firstLeftChild_4.left=secondLeftChild_11;

        secondLeftChild_11.left=thirdLeftLeftChild_7;
        secondLeftChild_11.right=thirdLeftRightChild_2;


        firstRightChild_8.left=secondRightLeftChild_13;
        firstRightChild_8.right=secondRightRightChild_4;

        secondRightRightChild_4.right=thirdRightRightChild1;

        return root;

    }

}