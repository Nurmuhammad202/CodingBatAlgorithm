package CodingBat.String2

import java.io.File
import java.io.FileReader


fun main() {
    val file = File("example.txt")
    val reader = FileReader(file) // IOException yuzaga kelishi mumkin
    println(reader.readText())
}