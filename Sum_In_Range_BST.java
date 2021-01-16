class Solution {
    int sum = 0;
    int low;
    int high;
    
    public int rangeSumBST(TreeNode root, int low, int high) {
    
        this.low = low;
        this.high = high;
        
        inorder(root);
        
        return sum;

    }
    
    public void inorder(TreeNode root)
    {
        if(root != null) {
            
            if(root.val>low)
            inorder(root.left);
            
            if(root.val>=low && root.val<=high)
                sum += root.val;
            
            if(root.val<high)
            inorder(root.right);
        }
    }
}
