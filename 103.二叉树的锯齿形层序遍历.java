import java.util.ArrayList;
import java.util.LinkedList;

import java.util.List;
import java.util.Queue;
import java.util.Stack;



/*
 * @lc app=leetcode.cn id=103 lang=java
 *
 * [103] 二叉树的锯齿形层序遍历
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
    public List<List<Integer>> zigzagLevelOrder(final TreeNode root) {
      if (root == null) {
        return new ArrayList<>();
      }
      final List<List<Integer>> zigzagTraveList = new ArrayList<>();
      final Stack<TreeNode> p = new Stack<>();
      final Queue<TreeNode> q = new LinkedList<>();
      q.offer(root);
      List <Integer>initList=new ArrayList<>();
      initList.add(root.val);
      zigzagTraveList.add(initList);
      int reg = 0;
     

      while (q != null) {
        final int qsz = q.size();
        int psz = p.size();
        final List<Integer> levelList = new ArrayList<>();
        if (reg == 0) {
          for (int i = 0; i < qsz; i++) {
            final TreeNode node = q.poll();
            if (node.left == null && node.right == null) {
              continue;
            }
            if (node.left != null) {
              p.push(node.left);
              levelList.add(node.left.val);
            }
            if (node.right != null) {
              p.push(node.right);
              levelList.add(node.right.val);
            }
          }
        } else {
          for (int i = 0; i < psz; i++) {
          final TreeNode node = p.pop();
        if(node.left==null&&node.right==null){
          continue;
        }
        if(node.left!=null){
          q.offer(node.left);
          levelList.add(node.left.val);
        }
        if(node.right!=null){
          q.offer(node.right);
          levelList.add(node.right.val);
        }
      }
      }
      reg=reg==0?1:0;
      if(!levelList.isEmpty())
      zigzagTraveList.add(levelList);
      }
      


      return zigzagTraveList;
    }
}
// @lc code=end

