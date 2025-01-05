package KotlinCore

fun main() {

    calculate(
        result = {

        }, onItemClick = {

        }
    )

    calculate(
        onItemClickLister = object : OnItemClickLister {
            override fun invoke(): String {
                return "salom"
            }
        }, result = object : Result {
            override fun invoke() {

            }
        })


    val item = "sakim"
    item.replace()

}

fun calculate(
    result: (String) -> Unit,
    onItemClick: () -> Unit
) {
    result("salom")
    onItemClick()
}

fun calculate(): (String) -> Int {
    return { 5 }
}


interface OnItemClickLister {
    operator fun invoke(): String
}

interface Result {
    operator fun invoke()
}

fun calculate(
    onItemClickLister: OnItemClickLister,
    result: Result
) {
    onItemClickLister.invoke()
    result.invoke()
}

fun String.replace(): String {
    return this.reversed()
}

fun replace(item: String): String {
    return item.reversed()
}