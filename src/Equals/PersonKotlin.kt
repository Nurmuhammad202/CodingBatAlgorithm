package Equals

class PersonKotlin(
    var name: String
) {
    override fun equals(other: Any?): Boolean {
        // Проверка на идентичность ссылок
        if (this === other) return true

        // Проверка на null и тип объекта
        if (other == null || other !is PersonKotlin) return false

        // Сравнение содержимого
        return this.name == other.name
    }

    override fun hashCode(): Int {
        return name.hashCode()
    }
}