class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        var map = new HashMap<Integer, Integer>();
        for (int i = 0; i < length; i++) {
            map.put(nums[i], i);
        }

        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int remainder = target - num;
            if(map.containsKey(remainder) && map.get(remainder) != i) {
                return new int[]{i, map.get(remainder)};
            }
        }

        return new int[]{};
    }
}