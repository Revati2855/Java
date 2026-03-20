import java.util.Scanner;

// User-defined Exception
class OddNumberException extends Exception {
    public OddNumberException(String message) {
        super(message);
    }
}

// Main Class
public class Practical6_2 {

    // Method to check number
    public static void checkNumber(int num) throws OddNumberException {
        if (num % 2 != 0) {
            throw new OddNumberException("Number is odd!");
        } else {
            System.out.println("Number is even.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        try {
            checkNumber(number);
        } catch (OddNumberException e) {
            System.out.println("Exception: " + e.getMessage());
        }

        System.out.println("Program continues...");
        
        sc.close();
    }
}
