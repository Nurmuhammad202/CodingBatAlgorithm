package LeetCode.Easy

class TwoSumm {
    fun twoSum(nums: IntArray, target: Int): IntArray {

        for ((index, i) in nums.withIndex()) {
            for ((index1, j) in nums.withIndex()) {
                if(i + j == target && (index != index1)) {
                    return intArrayOf(index,index1)
                }
            }
        }
        //
        return intArrayOf()
    }
}