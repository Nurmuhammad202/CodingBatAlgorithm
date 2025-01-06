package KotlinCore

data class Person(var name: String = "", var age: Int = 0)


fun main() {
    var person = Person(name = "nur")
    println(person)
    person = person.copy(age = 1)
    println(person)
}