package arrayquestion

class SmallestPairDifference {

    /*Return a pair that returns the smallest difference:
       [-1,5,10,20,28,3]
       [26,134,135,15,17]
    answer: [28,26]
     */
    fun smallestDifference(arrayOne: MutableList<Int>, arrayTwo: MutableList<Int>): List<Int> {
        // Write your code here.
        arrayOne.sort()
        arrayTwo.sort()
        var indexOne = 0
        var indexTwo = 0
        var current = 0
        var smallest = Int.MAX_VALUE
        var smallestPair = listOf<Int>()

        if (arrayOne.isEmpty() && arrayTwo.isEmpty()) return emptyList()

        while (indexOne < arrayOne.size && indexTwo < arrayTwo.size) {
            val firstNum = arrayOne[indexOne]
            val secondNum = arrayTwo[indexTwo]
            when {
                firstNum < secondNum -> {
                    current = secondNum - firstNum
                    indexOne++
                }
                secondNum < firstNum -> {
                    current = firstNum - secondNum
                    indexTwo++
                }
                else -> {
                    return listOf(firstNum, secondNum)
                }
            }
            if (current < smallest) {
                smallest = current
                smallestPair = listOf(firstNum, secondNum)
            }
        }
        return smallestPair
    }

}