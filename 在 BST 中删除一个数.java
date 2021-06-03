class solution {
  TreeNode deleteBST (TreeNode root, int val){
if(root==null){return root;}
if(root.val>val){
  return deleteBST(root.left, val);
}
if(root.val<val){
  return deleteBST(root.right, val);
}
return root;
  }
}