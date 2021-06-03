/*
 * @lc app=leetcode.cn id=96 lang=java
 *
 * [96] 不同的二叉搜索树
 */

// @lc code=start
class Solution {
  public int numTrees(int n) {
  Arraylist <Integer> dp=new Arraylist<>();
  dp.add(0);
  dp.add(1);
  for(int i=2;i<n+1;i++){
      for(int j=1;j<i+1;j++){
          dp[i]+=dp[j-1]*dp[n-j];
      }
  }
  return dp[n];
  }
}
// @lc code=end

