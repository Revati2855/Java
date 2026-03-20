// Custom Exception
class DivisionException extends Exception {
    public DivisionException(String message) {
        super(message);
    }
}

// Calculator Class
class Calculator {

    public int divide(int a, int b) throws DivisionException {
        if (b == 0) {
            throw new DivisionException("Cannot divide by zero!");
        }
        return a / b;
    }
}

// Main Class
public class Practical6_3 {

    public static void main(String[] args) {

        Calculator calc = new Calculator();

        try {
            int result = calc.divide(10, 0); 
            System.out.println("Result: " + result);
        } catch (DivisionException e) {
            System.out.println("Error: " + e.getMessage());
        }

        System.out.println("Program continues...");
    }
}
