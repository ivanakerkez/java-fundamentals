package homework03;

// Write a for loop that goes from 0 to 50 and displays all numbers divisible by 3.

public class ForLoop {
    public static void main(String[] args) {

        // for loop is used when we know exactly how many times we want to loop through a block of code
        // variable i is initialized to 0, and after each iteration is incremented by 1
        // the loop continues as long as i is less than or equal to 50

        for(int i = 0; i <= 50; i++) {

            // if statement is used to check if the current value of i is divisible by 3 and if i is not equal to 0
            if (i % 3 == 0 && i != 0) {

                // System.out.print is used for printing out the numbers that meet specified criteria from the if statement
                // numbers are printed on the same line with a space between them
                System.out.print(i + " ");
            }
        }
    }
}
