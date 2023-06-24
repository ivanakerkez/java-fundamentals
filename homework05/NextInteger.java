package homework05;

// Create a method that returns a boolean value and accepts two integers as parameters.
// The method returns true only if the two integers are consecutive, for example, 16 and 17, or 24 and 25.
// In the main method, use println to display several examples for testing (4-5 calls are sufficient).

public class NextInteger {
    public static void main(String[] args) {
        System.out.println(nextNumbers(1, 2)); // true, numbers are consecutive
        System.out.println(nextNumbers(11, 10)); // false, numbers are not consecutive
        System.out.println(nextNumbers(100, 101)); // true, numbers are consecutive
        System.out.println(nextNumbers(50, 100)); // false, numbers are not consecutive
        System.out.println(nextNumbers(25, 27)); // false, numbers are not consecutive
    }

    public static boolean nextNumbers(int firstNumber, int secondNumber) {

        // if we subtract the first from the second number and the result is equal to 1
        // it means that the first and second numbers are consecutive
        return (secondNumber - firstNumber) == 1;
    }
}
