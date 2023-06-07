package homework03;

// Using a while loop, the user continuously enters numbers and they are added up.
// When the user enters 0, the program prints the sum of the previously entered numbers and the program ends.

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {

        // while loop is used when we don"t know exactly how many times we want to loop through a block of code
        // the code in the loop will run as long as a specified condition is true

        Scanner scanner = new Scanner(System.in);

        double number;
        double sum = 0;

        System.out.println("Enter numbers to calculate their sum (enter 0 to exit):");

        // while loop is declared with the condition true
        // since it's always true, the loop will continue to execute its block of code indefinitely
        // (until it reaches a break statement)

        while (true) {
            number = scanner.nextInt();
            if (number == 0) {
                break;  // it exits the loop when the user enters 0
            }
            sum += number;  // sum = sum + number; it adds the entered number to the sum
        }

        scanner.close();

        System.out.print("The sum of the entered numbers is: " + sum);

    }
}
