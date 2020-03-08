/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        TreeNode root = insert(0, nums.length-1, nums);
        return root;
    }


    public TreeNode insert(int left ,int right,int[] nums){
        if(left>right){
            return null;
        }

        int pointer = (left + right)/2;
        TreeNode node = new TreeNode(nums[pointer]);
        node.left = insert(left, pointer-1, nums);
        node.right = insert(pointer+1, right, nums);
        return node;
    }

    /**
     * 二茬搜索树的出入操作
     * @param root
     * @param data
     */
    public void insertBinaryTree(TreeNode root, int data) {
        if (data > root.val) {
            if (root.right == null) {
                root.right = new TreeNode(data);
            } else {
                insertBinaryTree(root.right, data);
            }
        } else {
            if (root.left == null) {
                root.left = new TreeNode(data);
            } else {
                insertBinaryTree(root.left, data);
            }
        }

    }

    public void preOrder(TreeNode tn) {
        if (tn == null) {
            return;
        }
        System.out.println(tn.val);
        preOrder(tn.left);
        preOrder(tn.right);
    }

    public static void main(String[] args) {
        int[] array = {-10,-3};
        Solution solution = new Solution();
        TreeNode root = solution.insert(0, array.length-1, array);
        // TreeNode root = solution.sortedArrayToBST(array);
        solution.preOrder(root);
    }
}