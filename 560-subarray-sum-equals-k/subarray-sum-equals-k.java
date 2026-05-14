import java.util.HashMap;

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentPrefixSum = 0;
        
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        map.put(0, 1);
        
        for (int i = 0; i < nums.length; i++) {
            currentPrefixSum += nums[i];
            
           
            if (map.containsKey(currentPrefixSum - k)) {
                count += map.get(currentPrefixSum - k);
            }
            
            map.put(currentPrefixSum, map.getOrDefault(currentPrefixSum, 0) + 1);
        }
        
        return count;
    }
}