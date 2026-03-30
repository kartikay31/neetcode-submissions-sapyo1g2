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
        Stack<TreeNode> st = new Stack<TreeNode>();
        TreeNode curr = root ;
        
        while(!st.isEmpty()|| curr!=null){
          if(curr==null){
            TreeNode pop = st.pop();
            list.add(pop.val);
            curr = pop.right;
          } else {
            st.push(curr);
            curr = curr.left;
          }
        }
        return list;
        

    }
}