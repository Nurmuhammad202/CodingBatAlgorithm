package Equals

class PersonKotlin(
    var name: String
) {
    override fun equals(other: Any?): Boolean {
        if (other is Person) {
            return this.name == other.name
        }
        return false
    }

//    override fun hashCode(): Int {
//        return name.length
//    }
}