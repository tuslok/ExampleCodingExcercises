package ReferenceTypes;

import java.util.Arrays;

public class Reference {
    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherValue = myIntValue;

        System.out.println("myIntValue= " + myIntValue);
        System.out.println("anotherIntValue= " + anotherValue);

        anotherValue++;
        System.out.println("myIntValue= " + myIntValue);
        System.out.println("anotherIntValue= " + anotherValue);

        int [] myIntArray = new int[5];
        int [] anotherArray = myIntArray;

        System.out.println("myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("anotherArray= " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;

        System.out.println("after change myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after change anotherArray= " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 9, 4, 2, 2};
        modifyArray(myIntArray);

        System.out.println("after modify myIntArray= " + Arrays.toString(myIntArray));
        System.out.println("after modify anotherArray= " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int [] array){
        array[0] = 2;
        array = new int [] {1, 2, 3, 4, 5};
    }

}
