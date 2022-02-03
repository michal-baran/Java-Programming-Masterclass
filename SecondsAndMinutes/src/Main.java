public class Main {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";


    public static void main(String[] args) {
        System.out.println(getDurationString(65, 45));
        System.out.println(getDurationString(3600));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(65,9));
    }

    public static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || seconds < 0 || seconds > 59) {
            return INVALID_VALUE_MESSAGE;
        }
        int ZZ = seconds;
        int YY = minutes % 60;
        int XX = minutes / 60;

        String secondsString = ZZ + "s";
        if (ZZ < 10) {
            secondsString = "0" + secondsString;
        }

        String minutesString = YY + "m ";
        if (YY < 10) {
            minutesString = "0" + minutesString;
        }

        String hoursString = XX + "h ";
        if (XX < 10) {
            hoursString = "0" + hoursString;
        }

        return hoursString + minutesString + secondsString;
    }


    public static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int ZZ = seconds % 60;
        int YY = seconds / 60;

        return getDurationString(YY, ZZ);

    }
}
