package CodingBat.String2.Equals;

import java.util.Objects;

public class Person {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на идентичность ссылок
        if (this == obj) {
            return true;
        }

        // Проверка на null и тип
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа
        Person person = (Person) obj;

        // Сравнение полей
        return Objects.equals(name, person.name);
    }
}
