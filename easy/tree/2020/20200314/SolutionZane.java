
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    private int min;
    private int pre;

    public int getMinimumDifference(TreeNode root) {
        min = Integer.MAX_VALUE;
        pre = -1;
        inOrder(root);
        return min;
    }

    /**
     * 中序遍历
     */
    private void inOrder(TreeNode root) {
        if (root == null) {
           return;
        }
        inOrder(root.left);
        if (pre != -1) {
            min = Math.min(min, root.val - pre);
        }
        pre = root.val;
        inOrder(root.right);
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
        solution.inOrder(root);

        System.out.println("******" + solution.min);
    }

}
