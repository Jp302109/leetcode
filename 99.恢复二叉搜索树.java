import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=99 lang=java
 *
 * [99] 恢复二叉搜索树
 */

// @lc code=start
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
    public void recoverTree(TreeNode root) {
      TreeNode b=root;
      TreeNode a=whreeWrong(root,b);
      swap(a,b);
    }
    public TreeNode whreeWrong(TreeNode root){
      TreeNode b=root;
      return whreeWrong(root,b);
    }
    public TreeNode whreeWrong(TreeNode root ,TreeNode b){
      if(root==null){return null;}
      if(root<=root.left){
        return root;
        b=root.left;
      }else if(root>=root.rght){
        return root;
        b=root.right;
      }else if(whreeWrong(root.left)!=null)return whreeWrong(root.left);else return whreeWrong(root.left);
    }
    public void swap(TreeNode a,TreeNode b){
      int temp=0;
      temp=a.val;
      a.val=b.val;
      b.val=temp;
    }
}
// @lc code=end

