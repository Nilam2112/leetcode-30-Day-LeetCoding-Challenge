class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] leftside = new int[n]; 
        leftside[0] = 1;
        for (int i = 1; i < n; i++) 
        {
        // (for[1,2,3,4]) :   1,   1,     2,          6          
            // leftside[i] = 1*nums[0]*nums[1]*...*nums[i-1]  
            leftside[i] = leftside[i - 1] * nums[i - 1];
        }
        int rightProduct = 1;
        for (int i = n - 1; i >= 0; i--) 
        {
            leftside[i] = rightProduct * leftside[i];
            rightProduct *= nums[i];
        }
        return leftside;
    }
}}