package leetcode.arrays

import kotlin.text.StringBuilder


fun main() {
    println(restoreString("codeleet", intArrayOf(4, 5, 6, 7, 0, 2, 1, 3)))
}


fun restoreString(s: String, indices: IntArray): String {
    val builder = StringBuilder(s)
    for (i in indices.indices) {
        builder.setCharAt(indices[i], s[i])
    }
    return builder.toString()
}

