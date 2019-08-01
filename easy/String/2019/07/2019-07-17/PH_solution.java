/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
 /**
*先序遍历，根左右
*递归算法，如果左右节点都为空，则返回该节点
*如何右节点为空。则遍历左节点并封锁括号
*

*/
class Solution {
    public String tree2str(TreeNode t) {
        if(t == null)
        {
            return "";
        }
        if(t.left == null && t.right == null)
        return t.val+"";
        if(t.right == null)
            return t.val+"("+tree2str(t.left)+")";
        return t.val+"("+tree2str(t.left)+")("+tree2str(t.right)+")";
    }
}
