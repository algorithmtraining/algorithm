/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return left>right?left+1:right+1;
    }

       /**
     * 使用递归来创建二叉树
     */
    public TreeNode createBinaryTreeByRecursive(int[] array, int index) {
        TreeNode tn = null;
        if (index < array.length) {
            int value = array[index];
            tn = new TreeNode(value);
            tn.left = createBinaryTreeByRecursive(array, index * 2 + 1);
            tn.right = createBinaryTreeByRecursive(array, index * 2 + 2);
            return tn;
        }
        return tn;
    }


    public void preOrder(TreeNode tn){
        if(tn == null){
            return;
        }
        System.out.println(tn.val);
        preOrder(tn.left);
        preOrder(tn.right);
    }

    public static void main(String[] args){
        int[] array = {3,9,20,0,0,15,7};
        Solution solution = new Solution();
        
        TreeNode root = solution.createBinaryTreeByRecursive(array, 0);
       int depth =  solution.maxDepth(root);
       System.out.println(depth);
       System.out.println("******");
        solution.preOrder(root);
    }

}