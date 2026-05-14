class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0;
        int maxKadane = Integer.MIN_VALUE;
        int minKadane = Integer.MAX_VALUE;
        int currentMax = 0;
        int currentMin = 0;

        for (int x : nums) {
            totalSum += x;

            // Standard Kadane to find Max Subarray Sum
            currentMax += x;
            maxKadane = Math.max(maxKadane, currentMax);
            if (currentMax < 0) currentMax = 0;

            // Standard Kadane to find Min Subarray Sum
            currentMin += x;
            minKadane = Math.min(minKadane, currentMin);
            if (currentMin > 0) currentMin = 0;
        }

        // Edge Case: If all numbers are negative, maxKadane will be the 
        // largest single element, but (totalSum - minKadane) would be 0.
        // We must return the maxKadane in this case.
        if (maxKadane < 0) {
            return maxKadane;
        }

        return Math.max(maxKadane, totalSum - minKadane);
    }
}