
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
    ArrayList<Integer> arrayList = new ArrayList<>();;

    public TreeNode convertBST(TreeNode root) {
        inOrderToList(root);
        inOrder(root);
        return root;
    }

    /**
     * 中序遍历
     */
    private void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        root.val = inOrderSum(root.val);;
        inOrder(root.right);
    }

    private void inOrderToList(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrderToList(root.left);
        arrayList.add(root.val);
        inOrderToList(root.right);
    }

   
    private int inOrderSum(int val) {
        int sum = 0;
        for (Integer tmp : arrayList) {
            if (tmp > val) {
                sum += tmp;
            }
        }
        return sum + val;
    }

    private void inOrder1(TreeNode root) {
        if (root == null) {
            return;
        }
        inOrder1(root.left);
        System.out.println(root.val);
        inOrder1(root.right);
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
        root = solution.convertBST(root);
        solution.inOrder1(root);

    }

}
