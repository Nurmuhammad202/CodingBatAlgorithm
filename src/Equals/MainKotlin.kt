package Equals

fun main() {
    val personKotlin = PersonKotlin("Nur");
    val personKotlin2 = PersonKotlin("Nur");

    println(personKotlin == personKotlin2)
    println(personKotlin === personKotlin2)
    println(personKotlin.equals(personKotlin2))
}