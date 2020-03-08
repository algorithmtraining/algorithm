/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;

        int left = depth(root.left);
        int right = depth(root.right);
        if (Math.abs(left - right) > 1)
            return false;

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftDepth = depth(root.left);
        int rightDepth = depth(root.right);
        return leftDepth > rightDepth ? leftDepth + 1 : rightDepth +1 ;
    }

    /**
     * 
     * 使用递归来创建二叉树
     * 
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

    public static void main(String[] args){
        int[] array = {3,9,20,0,0,15,7};
        Solution solution = new Solution();
        
        TreeNode root = solution.createBinaryTreeByRecursive(array, 0);
       solution.isBalanced(root);

       System.out.println("******"+  solution.isBalanced(root));

    }
}