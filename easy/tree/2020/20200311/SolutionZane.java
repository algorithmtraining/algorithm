import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

import javafx.util.Pair;
import sun.reflect.generics.tree.Tree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            res += root.left.val;
        }

        return res + sumOfLeftLeaves(root.left) + sumOfLeftLeaves(root.right);
    }

    public int sumOfLeftLeaves1(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int sum = 0;
        Stack<Pair<TreeNode, Boolean>> nodeStack = new Stack<Pair<TreeNode, Boolean>>();
        nodeStack.push(new Pair<TreeNode, Boolean>(root, false));
        Pair<TreeNode, Boolean> node = null;
        while (!nodeStack.isEmpty()) {
            node = nodeStack.pop();
            if (node.getValue() && node.getKey().left == null && node.getKey().right == null) {
                sum += node.getKey().val;
            }
            if (node.getKey().right != null) {
                nodeStack.push(new Pair<TreeNode, Boolean>(node.getKey().right, false));
            }

            if (node.getKey().left != null) {
                nodeStack.push(new Pair<TreeNode, Boolean>(node.getKey().left, true));
            }
        }

        return sum;

    }

    public void depthOrderTraversal(TreeNode root) {
        if (root == null) {
            System.out.println("为空树");
            return;
        }
        Stack<TreeNode> node_stack = new Stack<TreeNode>();
        node_stack.push(root);
        TreeNode currentNode;
        String path;
        while (node_stack.isEmpty() != true) {
            currentNode = node_stack.pop();
            System.out.print(currentNode.val + " ");
            if (currentNode.right != null) {
                node_stack.push(currentNode.right);
            }
            if (currentNode.left != null) {
                node_stack.push(currentNode.left);
            }
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

    public static void main(String[] args) {
        Integer[] array = { 1, 2, 3, null, 5, null, null };
        Solution solution = new Solution();

        TreeNode root = solution.createBinaryTreeByLevel(array);
        solution.depthOrderTraversal(root);

        List<String> strings = solution.binaryTreePaths(root);
        System.out.println("******" + strings);
    }
}