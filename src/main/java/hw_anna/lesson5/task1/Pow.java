package hw_anna.lesson5.task1;

public class Pow {

    public static void main(String[] args) {
        System.out.println(pow(2, 4));
        System.out.println(pow(2, -2));
        System.out.println(pow(3, 3));
        System.out.println(pow(3, -2));
    }

    private static double pow(double value, int pow_value) {
        if (pow_value < 0) {
            pow_value = Math.abs(pow_value);
            value = 1 / value;
        }

        if (pow_value == 1) {
            return value;
        }

        return value * pow(value, pow_value - 1);
    }
}
