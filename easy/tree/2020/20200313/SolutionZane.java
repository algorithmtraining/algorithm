import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Stack;

class Solution {
    public int[] findMode(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        int[] n = {};
        if (root == null) {
            return n;
        }

        Stack<TreeNode> stack = new Stack<>();
        stack.push(root);
        TreeNode node = null;
        while (!stack.isEmpty()) {
            node = stack.pop();
            if (map.get(node.val) != null) {
                map.put(node.val, map.get(node.val) + 1);
            } else {
                map.put(node.val, 1);
            }

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null) {
                stack.push(node.left);
            }
        }
        Collection<Integer> c = map.values();
        Object[] obj = c.toArray();
        Arrays.sort(obj);
       int maxValue = (int)obj[obj.length-1];
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == maxValue) {
                nums.add(entry.getKey());
            }
        }

        Integer[] nun = nums.stream().toArray(Integer[]::new);
         n = new int[nun.length];
        for(int i=0;i<nun.length;i++){
            n[i] = nun[i];
        }
        return n;

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
        Integer[] array = { 1, 2, 2};
        Solution solution = new Solution();

        TreeNode root = solution.createBinaryTreeByLevel(array);
        int[] num = solution.findMode(root);

        System.out.println("******" + num);
    }

}
