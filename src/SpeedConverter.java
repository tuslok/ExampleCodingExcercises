public class SpeedConverter {

    public static void main(String[] args) {
        double miles = SpeedConverter.toMilePerHour(56);
        SpeedConverter.printConversion(miles);
        miles = SpeedConverter.toMilePerHour(-6);
        SpeedConverter.printConversion(miles);
    }

    static long toMilePerHour(double kilometersPerHour){
        if(kilometersPerHour < 0){
            return -1;
        } else {
            return Math.round(kilometersPerHour / 1.609);
        }
    }

    public static void printConversion(double kilometersPerHour){
        if(kilometersPerHour < 0){
            System.out.println("Invalid Value");
        } else {
            long milesPerHour = toMilePerHour(kilometersPerHour);
            System.out.println(kilometersPerHour + " km/h = " + milesPerHour + " mi/h.");
        }
    }
}
