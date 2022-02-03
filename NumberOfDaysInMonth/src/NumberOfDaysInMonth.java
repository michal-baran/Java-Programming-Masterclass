public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year >= 1 && year <= 9999) {
            if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
                return true;
            }
        } else {
            return false;
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        int numberOfDays = 0;
        if ((month >= 1 && month <= 12) && (year > 1 && year < 9999)) {

            boolean isLeapYear = isLeapYear(year);

            switch (month) {
                case 4:
                case 6:
                case 9:
                case 11:
                    numberOfDays = 30;
                    break;
                case 2:
                    if (isLeapYear) {
                        numberOfDays = 29;
                    } else {
                        numberOfDays = 28;
                    }
                    break;
                default:
                    numberOfDays = 31;
                    break;
            }
            return numberOfDays;
        }
        return -1;
    }
}

