class Solution {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int i = 0;
        int max = nums[i];
        int min = nums[i];
        int ans = Math.abs(nums[i]);
        for(i = 1; i < n; i++){
            max = Math.max(nums[i], max + nums[i]);
            min = Math.min(nums[i], min + nums[i]);
            ans = Math.max(ans, Math.max(Math.abs(min), Math.abs(max)));
        }
        return ans;
    }
}