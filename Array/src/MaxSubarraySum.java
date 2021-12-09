/**
 * @author yanliu
 * @create 2021-10-29-11:04 AM
 */
public class MaxSubarraySum {
    /**
     * using kadane's algorithm to solve the problem
     */
    static class Solution1 {
        public int maxSubarraySum(int[] nums) {
            if (nums == null || nums.length == 0) {
                return Integer.MIN_VALUE;
            }

            // used to store the max sum of continuous array
            // ending in the current position
            int maxEndingHere = 0;
            // used to store the max sum of continuous array so far
            // do not need to end in the current position
            int maxSoFar = Integer.MIN_VALUE;

            for (int i = 0; i < nums.length; i++) {
                maxEndingHere += nums[i];


                if (maxEndingHere < nums[i]) {
                    // remove previous one when it is less than the current value
                    // update it to the current value
                    maxEndingHere = nums[i];

                }

                if (maxSoFar < maxEndingHere) {
                    // update the max sum
                    maxSoFar = maxEndingHere;
                }
            }

            return maxSoFar;
        }
    }
}
