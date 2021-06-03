import java.util.HashMap;

import javax.swing.tree.TreeNode;

import apple.laf.JRSUIUtils.Tree;

/*
 * @lc app=leetcode.cn id=1028 lang=java
 *
 * [1028] 从先序遍历还原二叉树
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
    public TreeNode recoverFromPreorder(String traversal) {
    HashMap<Integer,Integer>map=parseString(traversal);
    Stack<Integer> s=new Stack<>();
    
    char[]chars=traversal.toCharArray();
    s.push(chars[0]);
    TreeNode u=TreeNode(chars[0]-'0');
    for(int i=1;i<chars.length;i++){
      TreeNode p=null;
      if(chars[i]!='-'){
        if(map.get(chars[i])>map.get(s.peek())){
          s.push(chars[i]);
          p=TreeNode(chars[i]);
          u.left=p;
          u=p;
        }else {
          while(map.get(chars[i])<=map.get(s.peek())){
          s.pop();
          }
          int var2=map.get(chars[i]);
          p=s.pop();
          p.right=TreeNode(var2);
        }
      }
    }
    TreeNode g,q=null;
    while(!s.isEmpty()){
        g=TreeNode(s.peek());
        if(g.left==null)g.left=q;
        else g.right=q;
        q=TreeNode(s.pop());
    }
    return u;
    }
    public HashMap<Integer,Integer> parseString(String traversal){
      HashMap<Integer,Integer>map=new HashMap<Integer,Integer>();
      map.put(chars[0]-'0',0);
      char[]chars=traversal.toCharArray();
      for(int i=1;i<chars.length;i++){
        int count=1;
        if(chars[i+1]='-'){
          count++;
          i++;
        }else{
        int d=chars[i]-'0';
        map.put(chars[i]-'0',count);
        }
      }
      return map;
    }
}
// @lc code=end

