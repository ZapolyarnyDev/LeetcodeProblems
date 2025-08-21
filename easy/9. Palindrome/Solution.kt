class Solution {
    fun isPalindrome(x: Int): Boolean {
        var input = x
        if (input < 0) return false

        var reverse = 0
        val copyX = input
        while (input > 0) {
            reverse = (reverse * 10) + input % 10
            input /= 10
        }
        return copyX == reverse
    }
}