class Solution {
    public int singleNumber(int[] nums) {
         int solution=0;
            for(int i=0;i<nums.length;i++){
                solution=solution^nums[i];
            }
            return solution;
}
}