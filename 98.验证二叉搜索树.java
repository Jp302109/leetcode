
/*
 * @lc app=leetcode.cn id=98 lang=java
 *
 * [98] 验证二叉搜索树
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
    public TreeNode findBiggest(TreeNode node){
        while(node.right!=null){
          node=node.right;
        }
        return node;
    }
    public TreeNode findSmallest(TreeNode node){
      while(node.left!=null){
        node=node.left;
      }
      return node;
    }
    public boolean isValidBST(TreeNode root) {
if(root==null){return true;}
if(root.left!=null&&root.val<=findBiggest(root.left).val)return false;
      if(root.right!=null&&root.val>=findSmallest(root.right).val)return false;
 return isValidBST(root.left)&&isValidBST(root.right);
    }
}
// @lc code=end

