package smallestpair


fun main() {

    // Check if int array has repeating numbers
    val sampleInput = intArrayOf(1, 1, 3, 4, 2)
    fun containsDuplicate(nums: IntArray): Boolean {
        val set: MutableSet<Int> = HashSet()
        for (x in nums) {
            if (set.contains(x)) {
                return true
            }
            set.add(x)
        }
        return false
    }
    /* print(containsDuplicate(sampleInput))*/


    fun sumDigitSquare(n: Int): Int {
        var n = n
        var sq = 0
        while (n > 0) {
            val digit = n % 10
            sq += digit * digit
            n = n / 10
        }
        return sq
    }

    // Check happy number
    fun isHappy(n: Int): Boolean {
        var n = n
        // A set to store numbers during
        // repeated square sum process
        // A set to store numbers during
        // repeated square sum process
        val s = HashSet<Int>()
        s.add(n)

        // Keep replacing n with sum of
        // squares of digits until we either
        // reach 1 or we endup in a cycle

        // Keep replacing n with sum of
        // squares of digits until we either
        // reach 1 or we endup in a cycle
        while (true) {

            // Number is Happy if we reach 1
            if (n === 1) return true

            // Replace n with sum of squares
            // of digits
            n = sumDigitSquare(n)

            // If n is already visited, a cycle
            // is formed, means not Happy
            if (s.contains(n) && n !== s.toTypedArray()[s.size - 1]) return false

            // Mark n as visited
            s.add(n)
        }
    }

    print(isHappy(19))
}