package homework03;

// Provide the sum of the numbers that the user enters using the scanner
// Use a do-while loop because at least one number must be entered
// The program prints what the sum is when the user enters 0 or a negative number

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        // do/while loop is a variant of the while loop
        // it ensured that the code block is executed at least once, before checking if the condition is true
        // after that, the loop repeats as long as the conditions are met

        Scanner scanner = new Scanner(System.in);

        double number;
        double sum = 0;

        do {
            System.out.print("Enter numbers to calculate their sum (enter 0 or a negative number to exit): ");
            number = scanner.nextInt();
            if (number > 0) {    // if the entered number is greater than 0, execute the following code block
                sum += number;   // sum = sum + number; it adds the entered number to the sum
            }
        } while (number > 0);    // repeat as long as the entered number is greater than 0

        scanner.close();

        System.out.print("The sum of the entered numbers is: " + sum);
    }
}
