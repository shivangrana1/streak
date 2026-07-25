class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int n = nums.length;
        int i = 0;
        int maxEnding = nums[i];
        int max = nums[i];
        int minEnding = nums[i];
        int min = nums[i];
        int totalSum = nums[i];
        for(i = 1; i < n; i++){
            totalSum = totalSum+nums[i];
            minEnding = Math.min(minEnding+nums[i] , nums[i]);
            min = Math.min(min, minEnding);
            maxEnding = Math.max(maxEnding+nums[i] , nums[i]);
            max = Math.max(max, maxEnding);
        }
        if(max < 0){
                return max;
            }
        return Math.max(max, totalSum - min);
    }
}