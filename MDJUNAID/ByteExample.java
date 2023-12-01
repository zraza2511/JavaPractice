public class ByteExample {
    public static void main(String[] args) {
        // Declaring and initializing byte variables
        byte smallNumber = 10;
        byte negativeNumber = -30;

        System.out.println("Value of smallNumber: " + smallNumber);
        System.out.println("Value of negativeNumber: " + negativeNumber);

        // Perform arithmetic operations with bytes
        byte sum = (byte) (smallNumber + negativeNumber); // Adding two bytes
        System.out.println("Sum of smallNumber and negativeNumber: " + sum);

        // Example of exceeding byte range
        byte exceedByte = 127;
        exceedByte++; // This will overflow since byte's range is -128 to 127
        System.out.println("Exceeded byte value: " + exceedByte);
    }
}
