import java.util.Queue;

import javax.swing.tree.TreeNode;

/*
 * @lc app=leetcode.cn id=110 lang=java
 *
 * [110] 平衡二叉树
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

    public boolean isBalanced(TreeNode root) {
      if(root==null)return true;
      if(root!=null){
    isBalanced(root.left);
    isBalanced(root.right);
    if(Math.abs(isHeight(root.left)-isHeight(root.right))>2)return false;
    }
    return true;
  }
    public int isHeight(TreeNode root) {
      int height=0;
      if(root==null){
        return 0;
      }
      Queue<TreeNode>q=new Queue<>();
      q.offer(root);
      while(!q.isEmpty()){
        for (int i = 0; i < q.size(); i++) {
          TreeNode c=q.poll();
          if(c.left==null&&c.right==null){
            return height;
          }
          if(c.left!=null){
            q.offer(c.left);
          }
          if(c.right!=null){
            q.offer(c.right);
          }
        }
       height++;

      }
      return height;
    }
    

}
// @lc code=end

