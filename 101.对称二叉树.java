import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/*
 * @lc app=leetcode.cn id=101 lang=java
 *
 * [101] 对称二叉树
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
    public boolean isSymmetric(TreeNode root) {
      ArrayList<int[]> List=BFS(root);
      for(int[] a : List) {
          int i=a.length/2;
          for(int b=0;b<i;b++){
            if(a[b]!=a[a.length-b])
            return false;
          }
      }
      return true;
  }
  public ArrayList<int[]> BFS(TreeNode root){
      if(root==null){
          return null;
      }
      ArrayList <int[]>List=new ArrayList<>();
      
      Queue <TreeNode> q=new LinkedList<>();
      q.offer(root);
      while(!q.isEmpty()){
        int sz=q.size();
        int []levelList=new int [sz];
        for (int i = 0; i <sz; i++) {
          TreeNode cur =q.poll();
          levelList[i]=cur.val;
          if(cur.left!=null)
          q.offer(cur.left);
          if(cur.right!=null)
          q.offer(cur.right);
          List.add(levelList);
        }
      }
return List;
  }
    
}
// @lc code=end

