class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]

        var maxFirst = 0
        var maxSecond = 0

        for (num in nums) {
            val cur = maxSecond.coerceAtLeast(maxFirst + num)
            maxFirst = maxSecond
            maxSecond = cur
        }

        return maxSecond
    }
}