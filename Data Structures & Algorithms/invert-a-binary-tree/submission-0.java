/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null){
            return null ;
        }
        TreeNode tmp1 = root.right;
        TreeNode tmp2 = root.left;
        root.right = tmp2;
        root.left =tmp1;
        invertTree(root.left);
        invertTree(root.right);
        return root;
    }
}
