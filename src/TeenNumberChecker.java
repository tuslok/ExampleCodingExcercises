
// We'll say that a number is "teen" if it is in the range 13 -19 (inclusive).
// Write a method named hasTeen with 3 parameters of type int.
// The method should return boolean and it needs to return
// true if one of the parameters is in range 13(inclusive) - 19 (inclusive).
// Otherwise return false.

// EXAMPLES OF INPUT/OUTPUT:
// hasTeen(9, 99, 19);  should return true since 19 is in range 13 - 19
// hasTeen(23, 15, 42);  should return true since 15 is in range 13 - 19
// hasTeen(22, 23, 34);  should return false since numbers 22, 23, 34 are not in range 13-19

// Write another method named isTeen with 1 parameter of type int.
// The method should return boolean and it needs to return true if the parameter is in range
// 13(inclusive) - 19 (inclusive). Otherwise return false.
// EXAMPLES OF INPUT/OUTPUT:
// isTeen(9);  should return false since 9 is in not range 13 - 19
// isTeen(13);  should return true since 13 is in range 13 - 19

public class TeenNumberChecker {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

        System.out.println(isTeen(9));
        System.out.println(isTeen(13));
    }

    public static boolean hasTeen(int firstNumber, int secondNumber, int thirdNumber){
        boolean isTeen = false;

        if((firstNumber >= 13 && firstNumber <= 19) ||
                (secondNumber >= 13 && secondNumber <= 19) ||
                (thirdNumber >= 13 && thirdNumber <= 19)) {
            isTeen = true;
        }
        return isTeen;
    }

    public static boolean isTeen(int age){
        boolean isTeen = false;
        if(age >= 13 && age <= 19){
            isTeen = true;
        }
        return isTeen;
    }
}
