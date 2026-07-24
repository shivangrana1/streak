class Solution {
    public int maxProduct(int[] nums) {
        int n = nums.length;
        int i = 0;
        int min = nums[i];
        int max = nums[i];
        int ans = nums[i];
        for(i = 1; i < n; i++){
            int v1 = nums[i];
            int v2 = min * nums[i];
            int v3 = max * nums[i];
            max = Math.max(v1, Math.max(v2, v3));
            min = Math.min(v1, Math.min(v2, v3));
            ans = Math.max(ans, Math.max(min , max));
        }
        return ans;
    }
}