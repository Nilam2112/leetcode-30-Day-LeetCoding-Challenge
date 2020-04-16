class Solution {
    public int maxSubArray(int[] nums) {
        
        int maximum_till_now = nums[0];
        int maximum_Ending = nums[0];

            for(int i = 1; i < nums.length; i++) 
            {
              if(maximum_Ending + nums[i] < nums[i]) 
                  {
                    maximum_Ending = nums[i];
                  } 
                else 
                  {
                    maximum_Ending = maximum_Ending + nums[i];
                  }

              if(maximum_Ending > maximum_till_now) 
                  {
                     maximum_till_now = maximum_Ending;
                  }
            }
        
    return maximum_till_now; 
    }
}