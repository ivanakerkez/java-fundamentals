package homework1.printtext;

// Use scanner to enter your first and last name separately, and then print your first and last name combined.

import java.util.Scanner;

public class InsertAndPrintText {
    public static void main(String[] args) {

        // to insert our own text, we'll need a scanner
        Scanner input = new Scanner(System.in); // input is the name of our scanner

        // camel case convention:
        // compound words or phrases are written without spaces or punctuation,
        // and the first letter of each word is capitalized except for the first word

        System.out.print("Enter your first name: ");
        String firstName = input.next(); // String is a variable used for storing text

        System.out.print("Enter your last name: ");
        String lastName = input.next(); // input.next() is used to read the next token of input from the user

        // we can use the + operator between strings to combine them (known as concatenation)
        // note tha we also need " " to insert a blank space between two strings

        System.out.println(firstName + " " + lastName);

        input.close(); // it's a good practice to close the scanner after we're done using it

        // run the program and see how it goes :)

    }
}
