package homework04;

// create an array of arbitrary length with integer values
// multiply the last element by the total number of elements
// use .length instead of a fixed value

public class AccessingArrayElements {
    public static void main(String[] args) {
        int[] array = {1, 3, 5, 7, 9, 11};

        // determining the total number of elements in the array
        int numberOfElements = array.length;

        // accessing the last element of the array
        int lastElement = array[numberOfElements - 1];

        // calculating the product of the last element and the total number of elements
        int product = lastElement * numberOfElements;

        System.out.println("The product of the last element and the total number of elements in the array is: " + product);
    }
}
