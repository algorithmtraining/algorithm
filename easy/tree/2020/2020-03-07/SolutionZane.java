/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null)
            return 1;

        int min = Integer.MAX_VALUE;
        if (root.left != null) {
            min = Math.min(minDepth(root.left), min);
        }
        if (root.right != null) {
            min = Math.min(minDepth(root.right), min);

        }
        return min+1;
    }

    public int minDepth_a(TreeNode root){
        if(root == null){
            return 0;
        }
        int left = minDepth_a(root.left);
        int right = minDepth_a(root.right);

        return left<right?left+1:right+1;
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

    public static void main(String[] args) {
        int[] array = { 3, 9, 20, 0, 0, 15, 7 };
        Solution solution = new Solution();

        TreeNode root = solution.createBinaryTreeByRecursive(array, 0);
        int depth = solution.minDepth(root);
        System.out.println(depth);
        System.out.println("******");
        // solution.preOrder(root);
    }

}