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
    int max_Diameter_value = 0;
    public int diameterOfBinaryTree(TreeNode root) {
         findDepth(root);
         return max_Diameter_value;   
    }
     private int findDepth(TreeNode root){
        if(root == null)
            return -1;
        int left = findDepth(root.left);
        int right = findDepth(root.right);
        int depth = Math.max(left,right)+1;
        int diameter_value = left+right+2;
        max_Diameter_value = Math.max(max_Diameter_value,diameter_value);
         return depth;
    }
}


}