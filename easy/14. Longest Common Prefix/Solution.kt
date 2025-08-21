class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if(strs.isEmpty()) return ""

        var min = Int.MAX_VALUE
        strs.forEach { s -> min = min.coerceAtMost(s.length) }

        for(i in 0 until min) {
            val c = strs[0][i]
            for(j in 1 until strs.size) {
                if(strs[j][i] != c) return strs[0].substring(0, i)
            }
        }

        return strs[0].substring(0, min)
    }
}