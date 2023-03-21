package crackingcodinginterview


fun plusMinus(arr: Array<Int>): Unit {
    var positiveTotal = 0.0
    var negativeTotal = 0
    var zeroTotal = 0

    var sizeOfArray = arr.size.toFloat()
    arr.forEach { it ->
        if (it > 0) {
            positiveTotal++
        } else if (it < 0) {
            negativeTotal++
        } else if (it == 0) {
            zeroTotal++
        }
    }

    println(positiveTotal.toFloat() / sizeOfArray)
    println(negativeTotal.toFloat() / sizeOfArray)
    println(zeroTotal.toFloat() / sizeOfArray)
}


/*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

/*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

fun miniMaxSum(arr: Array<Int>): Unit {
    var min: Long = arr[0].toLong()
    var max: Long = arr[0].toLong()
    var totalSum = 0.toLong()

    for (i in arr) {
        totalSum += i
        if (i < min) min = i.toLong()
        if (i > max) max = i.toLong()
    }

    print("${totalSum - max} ${totalSum - min}")
}

fun timeConversion(s: String): String {
    var prefix = s.substring(0, 2) //12
    var timePrefix = s.substring(s.length - 2)
    var timeDigits = s.substring(2, s.length - 2)

    prefix = if (prefix == "12" && timePrefix == "PM") {
        "12"
    } else if (prefix == "12" && timePrefix == "AM") {
        "00"
    } else if (prefix != "12" && timePrefix == "AM") {
        prefix
    } else {
        (prefix.toInt() + 12).toString()
    }

    return prefix + timeDigits

}

fun makeAnagram(a: String?, b: String?): Int {
    // Write your code here
    if (a == null && b == null) {
        return 1
    }
    if (a == null) {
        return 0
    }

    // Create hashmap to hold char freq of one of the strings
    val mapOfChar = HashMap<Char, Int>()
    for (element in a) {
        val c = element
        mapOfChar[c] = mapOfChar.getOrDefault(c, 0) + 1
    }
    var count = 0

    // Check if every character in second word is in first word and remove it. If it is not, then increase count
    for (i in 0 until b!!.length) {
        val c = b[i]
        if (mapOfChar.containsKey(c)) {
            mapOfChar[c] = mapOfChar.getOrDefault(c, 0) - 1
            if (mapOfChar[c] == 0) {
                mapOfChar.remove(c)
            }
        } else {
            count++
        }
    }

    // If the map of first word is not empty then add the remaining frequencies of characters into count and return.
    if (!mapOfChar.isEmpty()) {
        for (`val` in mapOfChar.values) {
            count += `val`
        }
    }
    return count
}


fun lonelyinteger(a: Array<Int>): Int {
    val sortedArray = a.sortedArray()
    var lonelyInteger = a[0]
    for (i in 0..sortedArray.size - 1 step 2) {
        if (i > 2 && sortedArray[i] != sortedArray[i - 2] && sortedArray[i] % 2 == 0) {
            lonelyInteger = sortedArray[i]
        } else if (sortedArray[i] % 2 != 0 && sortedArray[i] != sortedArray[i - 1]) {
            lonelyInteger = sortedArray[i]

        }
    }
    return lonelyInteger
}


fun countToMakeAlternate(s: String): Int {
    var result = 0
    for (i in 0 until s.length - 1)  // if two alternating characters
    // of string are same
        if (s[i] == s[i + 1]) result++ // then need to
    // delete a character
    return result
}


fun alternatingCharacters(s: String): Int {
    for (i in 0..s.length - 1) {
        while (i < s.length - 1) {
            if (s[i] != s[i + 1]) {
                s.removeRange(i, i + 1)
                print("removed $i ${i + 1}")
            }
        }
    }
    return s.length
}


fun repeatedString(s: String, n: Long): Long {
    // Write your code here
    val length = s.length
    var q = n / length
    var r = n % length
    var partialLenStr = s.substring(0, r.toInt()).length
    var aCount = q * getLetterCount(s, length) + getLetterCount(s, partialLenStr)

    return aCount
}

fun getLetterCount(s: String, n: Int): Int {
    var count = 0
    for (i in 0 until n) {
        if (s[i] == 'a') {
            count++
        }
    }
    return count
}


fun main(args: Array<String>) {
    println(repeatedString("aba", 10))

}

