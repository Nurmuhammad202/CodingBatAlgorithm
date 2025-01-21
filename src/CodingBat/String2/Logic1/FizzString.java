package CodingBat.String2.Logic1;

public class FizzString {
    public String fizzString(String str) {
        if(!str.startsWith("f") && !str.endsWith("b")) {
            return str;
        }

        StringBuilder stringBuilder = new StringBuilder();

        if(str.startsWith("f")) {
            stringBuilder.append("Fizz");
        }

        if(str.endsWith("b")) {
            stringBuilder.append("Buzz");
        }

        return stringBuilder.toString();
    }
}
