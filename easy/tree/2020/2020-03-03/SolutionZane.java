/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> nList = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null){
            queue.offer(root);
        }else{
            return nList;
        }
        List<Integer> tempList = new ArrayList<Integer>();
        TreeNode node;
        int size = queue.size();
        while(!queue.isEmpty()){
            node = queue.poll();
            tempList.add(node.val);
            size--;
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }

            if(size == 0){
                nList.add(0,tempList);
                tempList = new ArrayList<Integer>();
                size=queue.size();
            }
        }
        return nList;
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


    public void preOrder(TreeNode tn){
        if(tn == null){
            return;
        }
        System.out.println(tn.val);
        preOrder(tn.left);
        preOrder(tn.right);
    }

    // 层次遍历
    public void levleOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<TreeNode>();
        if(root != null){
            queue.offer(root);
        }
        TreeNode node;
        while(!queue.isEmpty()){
            node = queue.poll();
            System.out.println(node.val);
            if(node.left != null){
                queue.offer(node.left);
            }
            if(node.right != null){
                queue.offer(node.right);
            }
        }
    }

    
    public static void main(String[] args){
        int[] array = {3,9,20,0,0,15,7};
        Solution solution = new Solution();
        
        TreeNode root = solution.createBinaryTreeByRecursive(array, 0);
        List<List<Integer>> nList = solution.levelOrderBottom(root);
        System.out.println(nList);
       System.out.println("******");
        solution.preOrder(root);
    }

}