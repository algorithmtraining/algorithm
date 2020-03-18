import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        Stack<TreeNode> tStack = new Stack<>();
        tStack.push(root);
        TreeNode node = null;
        TreeNode tempNode = null;
        while (!tStack.empty()) {
            node = tStack.pop();
            if (node.right != null) {
                tStack.push(node.right);
            }
            if (node.left != null) {
                tStack.push(node.left);
            }
            tempNode = node.right;
            node.right = node.left;
            node.left = tempNode;
        }

        return root;
    }

    public void inverseTree(TreeNode root) {
        Stack<TreeNode> tStack = new Stack<>();
        tStack.push(root);
        TreeNode node = null;
        TreeNode tempNode = null;
        while (!tStack.empty()) {
            node = tStack.pop();
            if (node.right != null) {
                tStack.push(node.right);
            }
            if (node.left != null) {
                tStack.push(node.left);
            }
            tempNode = node.right;
            node.right = node.left;
            node.left = tempNode;
        }

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

    public void preOrder(TreeNode tn) {
        if (tn == null) {
            return;
        }
        System.out.println(tn.val);
        preOrder(tn.left);
        preOrder(tn.right);
    }

    public static void main(String[] args) {
        Integer[] array = { 4, 2, 7, 1, 3, 6, 9 };
        Solution solution = new Solution();

        TreeNode root = solution.createBinaryTreeByLevel(array);
        solution.preOrder(root);

        solution.inverseTree(root);
        System.out.println("******");
        solution.preOrder(root);
    }
}