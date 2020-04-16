class Solution {
    public String stringShift(String s, int[][] shift) {
        int sum = 0;
        
        for(int[] arr: shift)
        {
            if(arr[0] == 0){
                sum = sum - arr[1];
            }
            else{
                
                sum = sum + arr[1];

            }
        }
         
        int len = s.length();
         
        //To order length below string length
        if(sum > len || -sum > len){
            sum = sum % len;
        }
         
        if(sum > 0){
        //Performing right reversal 
            int d = len - sum;
            String result = s.substring(d) + s.substring(0,d);
            return result;
        }
        else if(sum < 0){
        //Performing left reversal
            sum = Math.abs(sum);
            String result = s.substring(sum) + s.substring(0,sum);
            return result;
        }
        return s;
    }
}