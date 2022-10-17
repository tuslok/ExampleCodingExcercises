public class DecimalComparator {

    /* Write a method areEqualByThreeDecimalPlaces with two parameters of type double.
    The method should return boolean and it needs to return true if two double numbers are the same up to three decimal places. Otherwise, return false.
    EXAMPLES OF INPUT/OUTPUT:
    areEqualByThreeDecimalPlaces(-3.1756, -3.175); → should return true since numbers are equal up to 3 decimal places.
    areEqualByThreeDecimalPlaces(3.175, 3.176); → should return false since numbers are not equal up to 3 decimal places
    areEqualByThreeDecimalPlaces(3.0, 3.0); → should return true since numbers are equal up to 3 decimal places.
    areEqualByThreeDecimalPlaces(-3.123, 3.123); → should return false since numbers are not equal up to 3 decimal places. */
    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(3.0, 3.0));
        System.out.println(areEqualByThreeDecimalPlaces(-3.123, 3.123));
        System.out.println(areEqualByThreeDecimalPlaces(-3.175, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondNumber){

        int first = (int) (firstNumber * 1000);
        int second = (int) (secondNumber * 1000);

       if(first - second == 0){
           return true;
       } else {
           return false;
       }
    }
}
