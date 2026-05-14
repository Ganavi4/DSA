class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum = 0;
        int leftSum = 0;

        // 1. Calculate the total sum of the array
        for (int x : nums) {
            totalSum += x;
        }

        // 2. Iterate through the array to find the balance point
        for (int i = 0; i < nums.length; i++) {
            // Check if left sum equals right sum
            // Equation: leftSum == totalSum - leftSum - nums[i]
            if (leftSum == totalSum - leftSum - nums[i]) {
                return i;
            }
            
            // Update leftSum for the next index
            leftSum += nums[i];
        }

        return -1;
    }
}