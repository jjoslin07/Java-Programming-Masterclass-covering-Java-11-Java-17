package com.josephjoslin;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        System.out.println(getDurationString(720, 23));
        System.out.println(getDurationString(1));
        System.out.println(getDurationString(-41));
        System.out.println(getDurationString(69,9));
        System.out.println(getDurationString(9));
    }

    private static String getDurationString(int minutes, int seconds) {
        if ((minutes >= 0) && (seconds >= 0) && (seconds <= 59)) {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;

            String hoursString = hours + "h ";
            if (hours < 10) {
                hoursString = "0" + hoursString;
            }
            String minutesString = remainingMinutes + "m ";
            if (remainingMinutes < 10) {
                minutesString = "0" + minutesString;
            }
            String secondsString = seconds + "s";
            if (seconds < 10) {
                secondsString = "0" + secondsString;
            }
            return hoursString + minutesString + secondsString;
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

    private static String getDurationString(int seconds) {
        if (seconds >= 0) {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        } else {
            return INVALID_VALUE_MESSAGE;
        }
    }

}
