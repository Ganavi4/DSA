class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum = 0, count = 0;
        for(int start = 0 ; start < nums.length ; start++){
            for(int end = start ; end < nums.length ; end++ ){
                sum += nums[end];
                if(sum == k){
                    count++;
                }
            }
            sum = 0;
        }
        return count;
    }
}