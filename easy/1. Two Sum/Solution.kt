class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val length = nums.size
        val map = HashMap<Int, Int>()

        for (i in 0 until length) {
            map[nums[i]] = i
        }

        for (i in 0 until length) {
            val num = nums[i]
            val remainder = target - num
            if (map.containsKey(remainder) && map[remainder] != i) {
                return intArrayOf(i, map[remainder]!!)
            }
        }

        return intArrayOf()
    }
}