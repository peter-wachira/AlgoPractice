package crackingcodinginterview.algorithims


class BinarySearch {

    // Returns index of x if it is present in arr[l..
    // r], else return -1
    fun binarySearch(arr: IntArray, l: Int, r: Int, x: Int): Int {
        if (r >= l) {
            val mid = l + (r - l) / 2

            // If the element is present at the
            // middle itself
            if (arr[mid] == x) return mid

            // If element is smaller than mid, then
            // it can only be present in left subarray
            return if (arr[mid] > x) binarySearch(arr, l, mid - 1, x) else binarySearch(arr, mid + 1, r, x)

            // Else the element can only be present
            // in right subarray
        }

        // We reach here when element is not present
        // in array
        return -1
    }


//    val binarySearch = BinarySearch()
//    val n = arr.size
//    val x = 54
//    val result = binarySearch.binarySearch(intArr, 0, intArr.size - 1, x)
//    if (result == -1) println("Element not present");
//    else
//    println(
//    "Element found at index "
//    + result
//    )
}


fun lonelyinteger(a: Array<Int>): Int {
    var lonelyInteger = a[0]
    val count = 1

    var frequencyHashMap = hashMapOf<Int, Int>()
    for (i in a.indices step 1) {
        if (frequencyHashMap.containsKey(a[i])) {
            val value = frequencyHashMap[a[i]]?.plus(1)
            if (value != null) {
                frequencyHashMap.put(a.get(i), value)
            }
        } else {
            frequencyHashMap.put(a.get(i), count)
        }
    }

    for (mutableEntry in frequencyHashMap) {
        if (mutableEntry.value == 1) {
            lonelyInteger = frequencyHashMap.get(mutableEntry.key)!!
        }
    }
    return lonelyInteger
}

fun alternatingCharacters(s: String): Int {
    for (i in s.indices - 1) {
        while (i < s.length - 1) {
            if (s[i] != s[i + 1]) {
                s.removeRange(i, i + 1)
                print("removed $i ${i + 1}")
            }
        }
    }
    return s.length
}


fun main() {
    println(alternatingCharacters("AABAAB"))
}