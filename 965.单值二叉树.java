import java.util.Set;

/*
 * @lc app=leetcode.cn id=965 lang=java
 *
 * [965] 单值二叉树
 */

// @lc code=start
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public boolean isUnivalTree(TreeNode root) {
    Set<Integer> s=new HashSet<>();
    s.add(root.val);
    if(root==null)return true;
    if(!s.contains(root.val)){
      return false;
    }
    isUnivalTree(root.left);
    isUnivalTree(root.right);
    }
}
// @lc code=end

