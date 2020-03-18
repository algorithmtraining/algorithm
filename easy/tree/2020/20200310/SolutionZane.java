import java.util.LinkedList;
import java.util.Queue;

import sun.reflect.generics.tree.Tree;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode small;
        TreeNode large;

        if (p.val > q.val) {
            large = p;
            small = q;
        } else {
            large = q;
            small = p;
        }

        while (root != null) {
            if (large.val < root.val && small.val<root.val){
                root = root.left;
            }

            if(large.val>root.val && small.val>root.val){
                root = root.right;
            }

            if(large.val >= root.val && small.val<=root.val){
                return root;
            }
        }
        return null;
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
        Integer[] array = { 2,1 };
        Solution solution = new Solution();

        TreeNode root = solution.createBinaryTreeByLevel(array);
        solution.preOrder(root);
        TreeNode p = new TreeNode(2);
        TreeNode q = new TreeNode(1);
        TreeNode s = solution.lowestCommonAncestor(root,p,q);
        System.out.println("******"+s.val);
        solution.preOrder(root);
    }
}