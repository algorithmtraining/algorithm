
import java.util.LinkedList;
import java.util.List;
class Solution {
    /**
     * 实际上就是用前序遍历的递归方式来做的
     * @param p
     * @param q
     * @return
     */
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q == null){
            return true;
        }
        if(p== null || q == null){
            return false;
        }
        if(p.val != q.val){
            return false;
        }
        return isSameTree(p.left, q.left)&& isSameTree(p.right, q.right);
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

    /**
     * 不使用递归来创建二叉树
     */
    public TreeNode createBinaryTree(int[] array) {
        List<TreeNode> nodeList = new LinkedList<TreeNode>();
        for (int i = 0; i < array.length; i++) {
            nodeList.add(new TreeNode(array[i]));
        }
        for (int parentIndex = 0; parentIndex < array.length / 2 - 1; parentIndex++) {
            nodeList.get(parentIndex).left = nodeList.get(parentIndex * 2 + 1);
            nodeList.get(parentIndex).right = nodeList.get(parentIndex * 2 + 2);
        }

        int lastParentIndex = array.length / 2 - 1;
        nodeList.get(lastParentIndex).left = nodeList.get(lastParentIndex * 2 + 1);
        if (lastParentIndex % 2 == 1) {
            nodeList.get(lastParentIndex).right = nodeList.get(lastParentIndex * 2 + 2);
        }
        return nodeList.get(0);
    }

    // public boolean preOrder(TreeNode node1, TreeNode node2) {
    //     Stack<TreeNode> aStack = new Stack<>();
    //     Stack<TreeNode> bStack = new Stack<>();

    //     if (node != null) {
    //         TreeNode p1 = node1;
    //         TreeNode p2 = node2;
    //         while ((p1 != null && p2 != null) || (!aStack.isEmpty()&&!bStack)) {
    //             if (p1 != null && p2 != null) {
    //                 if (p1.val != p2.val) {
    //                     return false;
    //                 }
    //                 aStack.push(p1);
    //                 bStack.push(p2);
    //                 p1 = p1.left;
    //                 p2 = p2.left;
    //             } 
    //         }
    //     }

    //     return true;
    // }
}