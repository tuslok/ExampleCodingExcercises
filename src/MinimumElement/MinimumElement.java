package MinimumElement;

import java.util.Scanner;

public class MinimumElement {

    /* Write a method called readInteger() that has no parameters and returns an int.
    It needs to read in an integer from the user - this represents how many elements the user needs to enter.
    Write another method called readElements() that has one parameter of type int
    The method needs to read from the console until all the elements are entered, and then return an array containing the elements entered.
    And finally, write a method called findMin() with one parameter of type int[]. The method needs to return the minimum value in the array.
    The scenario is:
            1. readInteger() is called.
            2. The number returned by readInteger() is then used to call readElements().
            3. The array returned from readElements() is used to call findMin().
            4. findMin() returns the minimum number. */
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        int[] returnedArray = readInteger(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("The minimum: " + returnedMin);
        System.out.println("Enter " + count + " numbers: : ");
        int [] anotherNumbers = readElements(count);
        int min2 = findMin(anotherNumbers);
        System.out.println("Min number 2: " + min2);
    }

    public static int[] readInteger(int count) {
        int[] array = new int[count];
        System.out.println("Enter the number: ");
        for (int i = 0; i < array.length; i++) {
            int number = scanner.nextInt();
            array[i] = number;
        }
        return array;
    }

    private static int[] readElements(int count) {
        int [] element = new int[count];
        for (int i = 0; i < element.length; i++) {
            int number = scanner.nextInt();
            element[i] = number;
        }
        return element;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            if (value < min) {
                min = value;
            }
        }
        return min;
    }
}
