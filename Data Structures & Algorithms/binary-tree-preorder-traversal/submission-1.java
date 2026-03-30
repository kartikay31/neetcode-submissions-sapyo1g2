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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr =  root ;
        while(st.isEmpty()!=true || curr !=null){
            if(curr!=null){
                res.add(curr.val);
                st.push(curr);
                curr = curr.left;
            }else{
                TreeNode tree = st.pop();
                curr = tree.right ;

            }
        }
        return res ;
    }
    
}