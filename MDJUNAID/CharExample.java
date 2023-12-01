public class CharExample {
    public static void main(String[] args) {
        //  Declaring and initializing char variables
        char firstLetter = 'A';
        char secondLetter = 'B';
        char specialChar = '$';
        
        //  Displaying the values 
        System.out.println("The first letter is: " + firstLetter);
        System.out.println("The second letter is: " + secondLetter);
        System.out.println("A special character is: " + specialChar);
        
        //  Char arithmetic (Unicode values)
        char result = (char) (firstLetter + 1); // Adding 1 to the Unicode value of 'A'
        System.out.println("Adding 1 to 'A' gives: " + result);
        
    }
}
