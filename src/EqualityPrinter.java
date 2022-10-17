import com.sun.jdi.Value;

public class EqualityPrinter {

    /* Write a method printEqual with 3 parameters of type int. The method should not return anything (void).
    If one of the parameters is less than 0, print text "Invalid Value".
    If all numbers are equal print text "All numbers are equal"
    If all numbers are different print text "All numbers are different".
    Otherwise, print "Neither all are equal or different".
    EXAMPLES OF INPUT/OUTPUT:
    printEqual(1, 1, 1); should print text All numbers are equal
    printEqual(1, 1, 2); should print text Neither all are equal or different
    printEqual(-1, -1, -1); should print text Invalid Value
    printEqual(1, 2, 3); should print text All numbers are different */

    public static final String INVALID_VALUE = "Invalid Value";

    public static void main(String[] args) {
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
    }

    public static void printEqual(int firstNum, int secondNum, int thirdNum){
        if(firstNum < 0 || secondNum < 0 || thirdNum < 0){
            System.out.println(INVALID_VALUE);
        } else {
            if(firstNum == secondNum && (secondNum == thirdNum)){
                System.out.println("All numbers are equal");
            } else if ((firstNum == secondNum)
                    || (secondNum == thirdNum)
                    || (firstNum == thirdNum)) {
                System.out.println("Neither all are equal or different");
            } else {
                System.out.println("All numbers are different");
            }
        }
    }
}
