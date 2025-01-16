import java.util.LinkedList

fun main() {
    val list = listOf(1,2,3)
    val mutableList = mutableListOf(1,2,3,4)
    mutableList.add(1)
    mutableList.removeAt(2)
    list
    val array = arrayOf(1,2,3)
    println(array.joinToString())
    array[0] = 0
    val array1 = Array<Int>(3, { 0 })
    array1[0] = 1
    array1[1] = 2
    array1[2] = 3
    println(array.joinToString())
    println(array1.joinToString())


    val setOf = setOf<Int>()
    val mapOf = mapOf<Int,String>()
    val listOf = listOf<Int>()
    val linkedListOf = LinkedList(listOf(1,2,3))
    val linkedList = LinkedList<String>()
    linkedList.add("1")

    val listOld = ArrayList<String>()
}

