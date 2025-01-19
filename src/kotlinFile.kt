class Producer<out T>(private val value: T) {
    fun produce(): T {
        return value
    }
}

class Consumer<in T> {
    fun consume(value: T) {
        // Consume value
    }
}


fun main() {
    val producer: Producer<String> = Producer("Generics")
    val value: String = producer.produce()

    val consumer: Consumer<Any> = Consumer()
    consumer.consume("Generics")

    println(value)
}