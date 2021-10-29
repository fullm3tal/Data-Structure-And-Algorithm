package leetcode.arrays



    fun main(){
       val array = intArrayOf(5,0,1,2,3,4)
      buildArray2(array).forEach {
            print(it)
        }
    }

    fun buildArray(nums: IntArray): IntArray {
        val arr = IntArray(nums.size)
        for (i in nums.indices){
            arr[i] = nums[nums[i]]
        }
        return arr
    }

fun buildArray2(nums: IntArray): IntArray {
    val arr = nums.copyOf()
   nums.forEachIndexed { index, i ->
       arr[index] = nums[nums[i]];
   }
    return arr
}