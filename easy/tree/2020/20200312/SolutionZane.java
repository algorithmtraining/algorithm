import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

import javax.print.DocFlavor.STRING;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    public void constructPath (TreeNode root,String path,LinkedList<String> paths){
        if(root != null){
            path += Integer.toString(root.val);
            if(root.left  == null && root.right == null){
                paths.add(path);
            }else{
                path+="->";
                constructPath(root.left, path, paths);
                constructPath(root.right, path, paths);
            }
        }
    }
    
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> strings = new ArrayList<String>();

        if (root == null) {
            return strings;
        }
        LinkedList<String> path_stack = new LinkedList<String>();
        LinkedList<TreeNode> node_stack = new LinkedList<TreeNode>();
        node_stack.add(root);
        path_stack.add(String.valueOf(root.val));

        TreeNode currentNode;
        String path;
        while (node_stack.isEmpty() != true) {
            path = path_stack.pollLast();
            currentNode = node_stack.pollLast();
            if (currentNode.left == null && currentNode.right == null) {
                strings.add(path);
            }

            if (currentNode.right != null) {
                node_stack.add(currentNode.right);
                path_stack.add(path + "->" + String.valueOf(currentNode.right.val));
            }
            if (currentNode.left != null) {
                node_stack.add(currentNode.left);
                path_stack.add(path + "->" + String.valueOf(currentNode.left.val));
            }
        }
        return strings;
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