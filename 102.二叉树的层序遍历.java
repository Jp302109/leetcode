import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=102 lang=java
 *
 * [102] 二叉树的层序遍历
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
    public List<List<Integer>> levelOrder(TreeNode root) {
      if(root==null){return new ArrayList<>();}
      List<List<Integer>> lists = new ArrayList<>();
      Queue<TreeNode> q=new LinkedList<>();
      q.offer(root);
      List <Integer>initList=new ArrayList<>();
      initList.add(root.val);
      lists.add(initList);
while(!q.isEmpty()){
int sz=q.size();
List <Integer>levelList=new ArrayList<>();
for (int i = 0; i < sz; i++) {
  TreeNode node=q.poll();
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
if(!levelList.isEmpty())
lists.add(levelList);
}
  return lists;
    }
}
// @lc code=end

