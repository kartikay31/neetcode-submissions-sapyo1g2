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
    
    public int maxDepth(TreeNode root) {
        return mDep(0,root);
    }
    private int mDep(int depth,TreeNode root){
        if(root==null){
            return depth ;
        }
        depth++ ;
        int rmax = mDep(depth,root.right);
        int lmax = mDep(depth,root.left);
        depth = Math.max(rmax,lmax) ;
        return depth ;
    }

}
