class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;

        for (int num : nums) {
            // When count reaches 0, we pick a new potential candidate
            if (count == 0) {
                candidate = num;
            }

            // If the current number matches the candidate, it gains a vote.
            // Otherwise, it loses a vote (cancellation).
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }

        return candidate;
    }
}