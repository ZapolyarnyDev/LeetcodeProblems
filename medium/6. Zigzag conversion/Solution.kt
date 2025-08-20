class Solution {
    fun convert(s: String, numRows: Int): String {
        if(numRows == 1) return s

        val builders = ArrayList<StringBuilder>()
        for (i in 0 until numRows) {
            builders.add(StringBuilder())
        }

        var currRow = 0
        var onTop = false
        for (c in s.toCharArray()) {
            builders[currRow].append(c)
            if(currRow == numRows - 1) onTop = true
            else if(currRow == 0) onTop = false
            currRow += if (onTop) -1 else 1
        }

        val converted = StringBuilder()
        builders.forEach(converted::append)

        return converted.toString()
    }
}