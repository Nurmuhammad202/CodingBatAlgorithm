package Equals

fun main() {

    val set = HashSet<PersonKotlin>()
    set.add(PersonKotlin("Nur"))
    set.add(PersonKotlin("Nur"))

    set.forEach {
        println("value-> : ${it.name}")
    }
}