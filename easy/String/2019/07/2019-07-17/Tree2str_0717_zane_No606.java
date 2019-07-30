package string;

/**
 * @author zane
 */
public class Tree2str_0717_zane_No606 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        Tree2str_0717_zane_No606 tree2str_0717_zane_no606 = new Tree2str_0717_zane_No606();
        TreeNode root = tree2str_0717_zane_no606.createBinaryTree(nums, 0);
        String s = tree2str_0717_zane_no606.tree2str(root);
        System.out.println(s);
    }

    /**
     * 顺序存储的数据，来创建完全二叉树
     * @param array
     * @param index
     * @return
     */
    private TreeNode createBinaryTree(int[] array, int index) {
        TreeNode treeNode = null;
        if (index < array.length) {
            treeNode = new TreeNode(array[index]);
            // 对于顺序存储的完全二叉树，如果某个节点的索引为index，其对应的左子树的索引为2*index+1，右子树为2*index+1
            treeNode.left = createBinaryTree(array, getLeftChildIndex(index));
            treeNode.right = createBinaryTree(array, getRigthChildIndex(index));
        }
        return treeNode;
    }

    /**
     * 返回左孩子节点索引位置
     * @param index
     * @return
     */
    private int getLeftChildIndex(int index) {
        return 2 * index + 1;
    }
    private int getRigthChildIndex(int index) {
        return 2 * index + 2;
    }

    public String tree2str(TreeNode t) {
        if (t==null){
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        preOrder(t, null, stringBuilder);
        String aString = stringBuilder.toString();
        return aString.substring(1,aString.length()-1);
//        return stringBuilder.toString();
    }

    /**
     * 先根遍历
     *
     * @param root
     */
    public static void preOrder(TreeNode root, TreeNode pre, StringBuilder stringBuilder) {

        if (root == null) {
            return;
        }
        if (pre != null && pre.left == null && pre.right == root) {
            stringBuilder.append("()");
        }
        stringBuilder.append('(');
        stringBuilder.append(root.val);
        preOrder(root.left, root, stringBuilder); //先根遍历左子树
        preOrder(root.right, root, stringBuilder);
        stringBuilder.append(')');
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }

        public int getVal() {
            return val;
        }

        public void setVal(int val) {
            this.val = val;
        }

        public TreeNode getLeft() {
            return left;
        }

        public void setLeft(TreeNode left) {
            this.left = left;
        }

        public TreeNode getRight() {
            return right;
        }

        public void setRight(TreeNode right) {
            this.right = right;
        }

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }

}
