package ReverseArray;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int [] numbers = {1, 2, 3, 4, 5};
        System.out.println("Array= " + Arrays.toString(numbers));
        toReverse(numbers);
        System.out.println("Reversed array= " + Arrays.toString(numbers));
    }

    private static void toReverse(int [] array){
        int maxIndex = array.length-1;
        int halfIndex = array.length / 2;
        for (int i = 0; i < halfIndex; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex - 1] = temp;
        }
    }
}
