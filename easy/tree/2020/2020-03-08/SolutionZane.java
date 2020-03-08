import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Definition for a binary tree node. public class TreeNode { int val; TreeNode
 * left; TreeNode right; TreeNode(int x) { val = x; } }
 */
class Solution {

    /**
     * 本题的要点就是将每遍历一个节点后的sum值保存在一个栈内，跟随节点一起出栈入栈。
     */
    public boolean hasPathSum(TreeNode root, int sum) {
        Stack<TreeNode> treeNodes = new Stack<TreeNode>();
        Stack<Integer> sumStack = new Stack<Integer>();
        TreeNode node;
        int currentSum;
        treeNodes.push(root);
        sumStack.push(sum - root.val);
        while (treeNodes.empty() == false) {
            node = treeNodes.pop();
            currentSum = sumStack.pop();
            if (currentSum == 0 && node.left == null && node.right == null) {
                return true;
            }

            if (node.right != null) {
                treeNodes.push(node.right);
                sumStack.push(currentSum - node.right.val);
            }

            if (node.left != null) {
                treeNodes.push(node.left);
                sumStack.push(currentSum - node.left.val);
            }
        }
        return false;
    }

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
            if(temp != null){
                TreeNode left = new TreeNode(temp);
                node.left = left;
                queue.offer(left);
            }
            temp = array[i++];
            if(temp != null){
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
        Integer[] array =  {3,9,20,null,null,15,7,null,null,null,null};
        Solution solution = new Solution();

        TreeNode root = solution.createBinaryTreeByLevel(array);
        boolean res = solution.hasPathSum(root, 38);
        System.out.println(res);
        System.out.println("******");
        solution.preOrder(root);
    }
}