class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i = 0; i < n; i++){
            int left = 0;
            for(int j = i; j < n; j++){
                left += nums[j];
                if(left == k){
                    count++;
                }
            }
        }
        return count;
    }
}