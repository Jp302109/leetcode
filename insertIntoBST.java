class Solution{
TreeNode insertIntoBST(TreeNode root, int val) {
    if(root==null)return new TreeNode(val);
    if(root.val>val)
        return insertIntoBST(root.left,val);
    if(root.val<val)
        return insertIntoBST(root.right,val);
    return root;
        }
      }