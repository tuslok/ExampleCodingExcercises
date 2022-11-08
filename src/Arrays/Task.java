package Arrays;

import java.util.Scanner;

// Create a program using arrays that sorts a list of integers in descending order.
// Descending order is highest value to lowest.
// In other words if the array had the values in it 106, 26, 81, 5, 15 your program should
// ultimately have an array with 106,81,26, 15, 5 in it.
// Set up the program so that the numbers to sort are read in from the keyboard.
// Implement the following methods - getIntegers, printArray, and sortIntegers
// getIntegers returns an array of entered integers from keyboard
// printArray prints out the contents of the array
// and sortIntegers should sort the array and return a new array containing the sorted numbers
// you will have to figure out how to copy the array elements from the passed array into a new
// array and sort them and return the new sorted array.

public class Task {

    public static void main(String[] args) {
        int[] myIntegers = getIntegers(5);
        printArray(myIntegers);
        System.out.println();
        printArray(sortIntegers(myIntegers));
    }
    public static int[] getIntegers(int capacity) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[capacity];
        System.out.println("Enter number: ");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }
    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Element " + i + " contents " + array[i]);
        }
    }
    public static int[] sortIntegers(int[] array) {
        //int[] sorted = Arrays.copyOf(array, array.length);


        int [] sorted = new int [array.length];
        for (int i = 0; i < array.length; i++) {
            sorted[i] = array[i];
        }
        //System.out.println("Print sorted array: ");
        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i+1] = temp;
                    flag = true;
                }
            }
        }
        return sorted;
    }
}

