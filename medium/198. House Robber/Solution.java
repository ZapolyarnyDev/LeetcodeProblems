class Solution {
   public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];

        int maxFirst = 0;
        int maxSecond = 0;
        int current = 0;

        for(int num : nums) {
            current = Math.max(maxSecond, maxFirst + num);
            maxFirst = maxSecond;
            maxSecond = current;
        }

        return current;
    }
}