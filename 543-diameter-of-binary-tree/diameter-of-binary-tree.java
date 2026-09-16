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
    public int hight (TreeNode root ){
        if(root == null){
            return 0 ;
        }
        return 1 + Math.max(hight(root.left) , hight(root.right));
    }
    public int diameterOfBinaryTree(TreeNode root) {
        if(root == null) return 0 ;
        if(root.left == null && root.right == null ) return 0;
        int left = diameterOfBinaryTree(root.left);
        int right = diameterOfBinaryTree(root.right);
        int mid = hight(root.left) + hight(root.right);
        // if(root.left != null) mid++;
        // if(root.right != null) mid++;

        int max = Math.max(left , Math.max(right , mid));
        return max;
        
    }
}