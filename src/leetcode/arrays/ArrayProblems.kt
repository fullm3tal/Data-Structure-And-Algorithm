package leetcode.arrays

fun main() {
    val array = intArrayOf(5,0,1,2,3,4)
    getConcatenation2(array).forEach {
        print(it)
    }
}

fun getConcatenation(nums: IntArray): IntArray {
    val arr = IntArray(2 * nums.size)
    var count  = 0
    for (j in 0..1) {
        nums.forEachIndexed { index, i ->
            arr[count] = nums[index]
            count++
        }
    }
    return arr
}

fun getConcatenation2(nums: IntArray): IntArray {
    val arr = IntArray(2 * nums.size)
    nums.forEachIndexed { index, i ->
        arr[index] = nums[index]
        arr[index+nums.size] = nums[index]
    }
    return arr
}
