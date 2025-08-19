class Solution {
    private object Symbols {
        val map: Map<Char, Int>  = mapOf(
            'I' to 1, 'V' to 5, 'X' to 10,
            'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
    }

    fun romanToInt(s: String): Int {
        var sum = 0
        val map: Map<Char, Int> = Symbols.map;
        s.forEachIndexed{
            i, c ->
            val value = map[c]!!
            if(i < s.lastIndex && value < map[s[i + 1]]!!){
                sum -= value
            } else {
                sum += value
            }
        }
        return sum;
    }
}