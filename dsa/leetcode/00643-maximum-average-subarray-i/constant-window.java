class Solution {
    public double findMaxAverage(int[] nums, int k) {
        if(nums.length == 1)
            return nums[0];

        int right = k-1;
        int left = 0;
        double maxsum = 0;

        for(int i = left; i <= right; i++){
            sum = sum + nums[i];
        }

        while(right<nums.length-1){
            double sum = sum - nums[left++] + nums[++right];
            maxsum = Math.max(sum, maxsum);
        }

        return maxsum/k;
    }
}
