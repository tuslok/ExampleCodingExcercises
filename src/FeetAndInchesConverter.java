public class FeetAndInchesConverter {

    public static void main(String[] args) {
        calcFeetAndInchesToCentimeters(6, 2);
        calcFeetAndInchesToCentimeters(-1, 5);
        calcFeetAndInchesToCentimeters(0, 1);
        calcFeetAndInchesToCentimeters(4, 16);

        calcFeetAndInchesToCentimeters(13);
        calcFeetAndInchesToCentimeters(103);
    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches) {

        if (feet < 0 || (inches < 0 || inches > 12)) {
            System.out.println("Invalid parameters.");
            return -1;
        }

        double centimeters = (feet * 12) * 2.54;
        centimeters = centimeters + inches * 2.54;

        System.out.println(feet + " feet, " + inches + " inches = " + centimeters + " cm.");

        return centimeters;
    }

    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches < 0){
            return -1;
        }

        double feet = (int) inches / 12;
        double remainingInches = (int) inches % 12;
        System.out.println(inches + " inches = " + feet + " feet and " + remainingInches + " inches");

        return calcFeetAndInchesToCentimeters((int) feet, (int) remainingInches);
    }
}
