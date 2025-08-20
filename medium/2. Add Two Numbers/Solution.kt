class Solution {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        val dummy = ListNode(0)
        var current = dummy

        var node1 = l1
        var node2 = l2

        var carry = 0

        while (node1 != null || node2 != null || carry != 0) {
            val x = node1?.`val` ?: 0
            val y = node2?.`val` ?: 0

            val sum = x + y + carry
            carry = sum / 10

            current.next = ListNode(sum % 10)
            current = current.next!!

            if (node1 != null) node1 = node1.next
            if (node2 != null) node2 = node2.next
        }

        return dummy.next
    }
}