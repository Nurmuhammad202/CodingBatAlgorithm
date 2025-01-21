package CodingBat.String2.observer

class Array1WithKotlin {

    fun firstLast6(nums: IntArray): Boolean {
        return (nums.first() == 6 || nums.last() == 6)
    }
}