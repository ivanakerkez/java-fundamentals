package temperatureConverter;

/* Use scanner to enter the temperature in Celsius as an integer value.
Convert from Celsius to Fahrenheit,
and the program should print both in the format "31C = 87.8F" (round Fahrenheit to one decimal place). */

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the temperature in Celsius: ");
        int temperatureC = input.nextInt(); // int is a variable used for storing whole numbers

        double temperatureF; // double is a variable used for storing fractional numbers
        temperatureF = temperatureC * 1.800 + 32; // we can use arithmetic operatores to perform common mathematical operations

        System.out.printf("%dC = %.1fF", temperatureC, temperatureF);

        /* Let's break that down:
        %d is a placeholder for an integer value
        C is a character which represents the Celsius unit
        %.1f specifies a floating-point number with one decimal place
        F is a character which represents the Fahrenheit unit */

    }
}
