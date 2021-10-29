package leetcode.arrays

fun main() {

    val arr = intArrayOf(17,18,5,4,6,1)
    replaceElements(arr)
    print("Done")
}


fun replaceElements2(arr: IntArray): IntArray {

//    Input: arr = [17,18,5,4,6,1]

    for (i in 0 until arr.size) {
        var largest: Int = -1
        for (j in i + 1 until arr.size) {
            if (largest < arr[j]) {
                largest = arr[j]
            }
        }
        arr[i] = largest
    }
    return arr
}

fun replaceElements(arr: IntArray): IntArray {

//    Input: arr = [17,18,5,4,6,1]

    var currentMax = -1
    var currentValue: Int
    for (i in arr.size - 1 downTo 0) {
        currentValue = arr[i]
        arr[i] = currentMax
        if(currentMax<currentValue){
            currentMax = currentValue
        }
    }
    return arr
}