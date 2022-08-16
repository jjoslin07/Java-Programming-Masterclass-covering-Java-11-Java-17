public class LeapYear {
    public static boolean isLeapYear(int year) {
        boolean isValidInput = year >= 1 && year <= 9999;
        if (isValidInput) {
            if (year % 4 == 0) {
                if (year % 100 == 0) {
                    return year % 400 == 0;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}