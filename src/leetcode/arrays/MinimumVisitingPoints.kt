package leetcode.arrays

import kotlin.math.abs
import kotlin.math.max

fun main() {
    val arraylist = arrayListOf(intArrayOf(1, 1), intArrayOf(3, 4), intArrayOf(-1, 0))
    print(minTimeToVisitAllPoints2(arraylist))
}


fun minTimeToVisitAllPoints(points: ArrayList<IntArray>): Int {
    var count = 0
    for (value in 0..points.size-2) {
        val first = points[value]
        val second = points[value+1]
        while (first[0] != second[0] || first[1] != second[1]) {
            if (first[0] < second[0]) {
                first[0] = first[0] + 1
            } else if (first[0] > second[0]) {
                first[0] = first[0] - 1
            }

            if (first[1] < second[1]) {
                first[1] = first[1] + 1
            } else if (first[1] > second[1]) {
                first[1] = first[1] - 1
            }
            count++
        }
    }
    return count
}

fun minTimeToVisitAllPoints2(points: ArrayList<IntArray>): Int {
    var count = 0
    if(points.size<2) return 0
    for (i in 1 until points.size)
        count += kotlin.math.max(kotlin.math.abs(points[i][0] - points[i - 1][0]), kotlin.math.abs(points[i][1] - points[i - 1][1]))
    return count
}
