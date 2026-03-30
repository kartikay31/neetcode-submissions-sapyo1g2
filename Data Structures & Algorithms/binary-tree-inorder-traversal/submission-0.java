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
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<Integer>();
        inordertraversal(list,root);
        return list;

    }
    private void inordertraversal(List<Integer> list,TreeNode root){
            if(root ==null){
                return;
            }
        
            inordertraversal(list,root.left);
            list.add(root.val);
            inordertraversal(list,root.right);
        
         
    }

}