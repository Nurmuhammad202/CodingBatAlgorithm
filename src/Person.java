final public class Person {
    public static final String MY_KEY = "key";
    final public double calculate(double a, double b) {
        return a + b;
    }
}


class PersonChild extends Person {
    @Override
    public double calculate(double a, double b) {
        return super.calculate(a, b);
    }
}