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
    int dia = 0 ;
    public int diameterOfBinaryTree(TreeNode root) {
       mDep(root);
        return dia ;
    }
    private int mDep(TreeNode root){
        if(root==null){
            return 0 ;
        }
       
        int rmax = mDep(root.right);
        int lmax = mDep(root.left);
        dia = Math.max(rmax+lmax,dia) ;
        return  Math.max(rmax,lmax)+1;
    }
}
