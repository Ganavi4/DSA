class Solution {
    public int missingNumber(int[] nums) {

       int act_sum = 0,n = nums.length;
       int exp_sum = n * (n + 1) / 2;    //using sum formula 
        
       for(int i = 0 ; i < nums.length ; i++){
        act_sum += nums[i];
       } 

    return exp_sum - act_sum;  
    }
}