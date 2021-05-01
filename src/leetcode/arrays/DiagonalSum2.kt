package leetcode.arrays

object DiagonalSum2 {
    fun diagonalSum(mat: Array<IntArray>): Int {
        var sum = 0
        var k: Int = mat[0].size - 1
        for ((j, i) in mat.indices.withIndex()) {
            sum += mat[i][j] + mat[k][j]
            if (i == j && j == k) {
                sum -= mat[i][j]
            }
            k--
        }
        return sum
    }
}

fun main() {
    val arr = arrayOf(intArrayOf(1, 2, 3), intArrayOf(4, 5, 6), intArrayOf(7, 8, 9))
    val start = System.currentTimeMillis()
    val sum = DiagonalSum.diagonalSum(arr)
    val end = System.currentTimeMillis()
    println(sum)
    print(end-start)
}
