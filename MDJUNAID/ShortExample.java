public class ShortExample {
    public static void main(String[] args) {
        short temperature = 25; // declaring and initializing a short variable
        System.out.println("The temperature is: " + temperature + " degrees Celsius");

        short minValue = Short.MIN_VALUE; // accessing the minimum value for short
        short maxValue = Short.MAX_VALUE; // accessing the maximum value for short

        System.out.println("Minimum value for short: " + minValue);
        System.out.println("Maximum value for short: " + maxValue);

        // Performing arithmetic operations
        short a = 100;
        short b = 200;
        short sum = (short) (a + b); // explicit casting to short as the result is int by default
        System.out.println("Sum of a and b: " + sum);
    }
}
