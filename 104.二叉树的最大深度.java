import java.util.LinkedList;
import java.util.Queue;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=104 lang=java
 *
 * [104] 二叉树的最大深度
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
    public int maxDepth(TreeNode root) {
if(root==null){
  return 0;
}
Queue<TreeNode> q=new LinkedList<>();
q.offer(root);
int depth=1;
while(!q.isEmpty()){
  int sz=q.size();
  for (int i = 0; i < sz; i++) {
    TreeNode node=q.poll();
    if(node.left!=null){
      q.offer(node.left);
    }
    if(node.right!=null){
      q.offer(node.right);
          }
  }
  depth++;
}
return depth-1;
    }
}
// @lc code=end

