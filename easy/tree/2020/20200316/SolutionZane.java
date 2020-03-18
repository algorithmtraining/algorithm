
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    int maxTrace = 1;

    /**
     * 直径可以转化为以一个节点为根，左右子树的最大高度之和减一
     * 涉及到树的高度问题，都要用深度遍历。
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
            depthOrder(root);
            return maxTrace-1;
    }

    private int depthOrder(TreeNode root) {
        if(root == null){
            return 0;
        }
        int left = depthOrder(root.left);
        int right = depthOrder(root.right);
        maxTrace = Math.max(maxTrace, left+right+1);
       return Math.max(left, right)+1;
    }

    public TreeNode createBinaryTreeByLevel(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        TreeNode root = new TreeNode(array[0]);
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        queue.offer(root);

        int i = 1;
        Integer temp = null;
        while (i < array.length) {
            TreeNode node = queue.poll();
            temp = array[i++];
            if (temp != null) {
                TreeNode left = new TreeNode(temp);
                node.left = left;
                queue.offer(left);
            }

            temp = array[i++];
            if (temp != null) {
                TreeNode right = new TreeNode(temp);
                node.right = right;
                queue.offer(right);
            }
        }
        return root;
    }

    public static void main(String[] args) {
        Integer[] array = { 1, null, 3, 2, null };
        Solution solution = new Solution();
        TreeNode root = solution.createBinaryTreeByLevel(array);
        System.out.println(solution.diameterOfBinaryTree(root));

    }

}
