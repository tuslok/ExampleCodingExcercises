import java.util.Scanner;

public class InputCalculator {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int counter = 0;

        while (true) {
            //System.out.println("Enter number: ");
            boolean isAnInt = scanner.hasNextInt();
            if (isAnInt) {
                int number = scanner.nextInt();
                sum = sum + number;
                counter++;
            } else {
                scanner.nextLine();
                System.out.println("SUM = " + sum + " AVG = " + Math.round((double) sum / counter));
                break;
            }
        }
        scanner.close();
    }
}
