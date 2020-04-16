class Solution {
    public int findMaxLength(int[] nums) {
        
//       method 1
//         int i, j, total = 0, maxSize = -1;
//         for(i=0;i<nums.length;i++)
//         {
//             total = (nums[i]==0)? -1:1;
//             for(j=i+1;j<nums.length;j++)
//             {
//                 if(nums[j]==0)
//                 {
//                     total += -1;
//                 }
//                 else
//                 {
//                     total += 1;
//                 }
//                 if(total == 0 && maxSize < j-i+1)
//                 {
//                     maxSize = j-i+1;
//                 }
//             }
//         }
//         if(maxSize == -1)
//         return 0;
//         else
//             return maxSize;
        
//  method 2
        Map<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int ans = 0;
        int balance = 0;
        for (int i = 0; i < nums.length; i++) 
        {
            balance += nums[i] == 1 ? 1 : -1;
            if (map.containsKey(balance)) 
            {
                ans = Math.max(ans, i - map.get(balance));
            } else 
            {
                map.put(balance, i);
            }
        }
        return ans;
    }
}