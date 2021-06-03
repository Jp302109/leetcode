import java.util.ArrayList;
import java.util.List;

/*
 * @lc app=leetcode.cn id=144 lang=java
 *
 * [144] 二叉树的前序遍历
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
  List <Integer>Traversal=new ArrayList<>();
    public List<Integer> preorderTraversal(TreeNode root) {
      if(root==null){return new ArrayList<>();}
       preorder(root);
      return Traversal;
    }
    public void preorder(TreeNode root){
      if(root==null){return;}
      Traversal.add(root.val);
      preorder(root.left);
      preorder(root.right);
    }
}
// @lc code=end

