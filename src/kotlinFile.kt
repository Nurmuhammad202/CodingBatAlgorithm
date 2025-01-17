fun main() {
    val person = Person<String>()
    person.print("124")
}

interface Ex<out T> {
    fun print(t: @UnsafeVariance T)
}

class Person<T>: Ex<T> {
    override fun print(t: T) {
        println(t)

        (t as String).reversed()
    }
}


fun <T> printSorted(items: List<T>) where T : Comparable<T> {
    println(items.sorted()) // Faqat Comparable interfeysini implement qilgan tiplarga ruxsat
}