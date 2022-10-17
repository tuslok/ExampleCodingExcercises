public class SecondAndMinutesChallenge {

    public static String getDurationString(int minutes, int seconds){
        if(minutes < 0 || (seconds < 0 || seconds > 59)){
            System.out.println("Invalid value");
        }

        int hour = minutes / 60;
        int minute = minutes % 60;
        String hoursString = hour + "h ";
        String minutesString = minute + "m ";
        String secondsString = seconds + "s ";

        if(hour < 10){
            hoursString = "0" + hoursString;
        }
        if (minute < 10) {
            minutesString = "0" + minutesString;
        }

        if (seconds < 10){
            secondsString = "0" + secondsString;
        }

        return hoursString + " " + minutesString + " " + secondsString;
    }

    public static String getDurationString(int seconds){
        if(seconds < 0){
            System.out.println("Invalid value");
        }

        int minute = seconds / 60;
        int second = seconds % 60;

        return getDurationString(minute, second);
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(66, 33));
        //System.out.println("");
        System.out.println(getDurationString(345));
    }
}
