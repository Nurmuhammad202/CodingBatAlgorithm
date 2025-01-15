import javax.lang.model.type.UnionType
import kotlin.random.Random

inline fun minus(
    noinline action: (Int) -> Unit,
    calculate: (String) -> Unit,
    listener: (String) -> Unit
) {
    action(read())
    calculate("Hello")

    listener("listener")
//    Thread {
//        listener("Hello")
//    }.start()
}

fun read(): Int {
    return Random.nextInt();
}

fun main() {
    minus(action = {
        println(it)
    }, calculate = {
        println(it)
    }, listener = {
        println(it)
        return
    })
}

