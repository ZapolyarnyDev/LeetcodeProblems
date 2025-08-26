class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val map = HashMap<Char, Int>()
        var maxLength = 0
        var left = 0
        
        for(i in s.indices) {
            val c = s[i]
            
            if(map.containsKey(c)) {
                left = left.coerceAtLeast(map[c]!! + 1)
            }
            map[c] = i
            maxLength = maxLength.coerceAtLeast(i - left + 1)
        }
        
        return maxLength
    }
}