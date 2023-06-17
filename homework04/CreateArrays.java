package homework04;

// create an array of 5 String elements and print the first element
// create another array of 5 elements but this time use integers and print the second element

public class CreateArrays {
    public static void main(String[] args) {
        String[] workingDays = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};

        // arrays are zero-indexed, which means that the first element of an array is accessed using the index 0

        System.out.println("The first working day of the week is " + workingDays[0] + ".");

        int[] numbers = {5, 10, 15, 20, 25};

        // the second element of an array is accessed using the index 1
        System.out.println("The second number in the array is " + numbers[1] + ".");
    }
}
