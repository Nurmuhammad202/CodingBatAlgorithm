class Mentor {
    init {
        Thread.sleep(2000)
        println("HeavyClass инициализирован!")
    }

    fun read() {
        println("HI")
    }
}

class Session {
    var mentor = Mentor()

    fun collect() {
        mentor.read()
    }

}

fun main() {
    val session = Session()
    session.collect()
}