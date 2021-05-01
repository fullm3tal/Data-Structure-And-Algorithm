package leetcode.arrays

object FindEven {
    fun findNumbers(nums: IntArray): Int {
        var count = 0
        for (i in nums) {
            if (i.toString().length % 2 == 0) {
                count++
            }
        }
        return count
    }

    fun findNumbers2(nums: IntArray): Int {
        var count = 0
        var pCount = 0
        for (number in nums) {
            var ans = number
            while (ans != 0) {
                ans /= 10
                pCount++
            }
            if (pCount % 2 == 0) {
                count++
            }
            pCount = 0
        }
        return count
    }

    fun findNumbers3(nums: IntArray): Int {
        return nums.map {
            it.toString().length
        }.count { it%2==0 }
    }

    fun findNumbers4(nums: IntArray): Int {
        val list = nums.map {
            it.toString()
        }
        return 0
    }

}

fun main() {
    val start = System.currentTimeMillis()
    print(FindEven.findNumbers(intArrayOf(12, 345, 2, 6, 7896)))
    val end = System.currentTimeMillis()
    print(end-start)
}
