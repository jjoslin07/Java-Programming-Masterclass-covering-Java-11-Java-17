public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
        boolean shouldWakeUp;
        if (hourOfDay < 0 || hourOfDay > 23) {
            shouldWakeUp = false;
        } else shouldWakeUp = (hourOfDay < 8 || hourOfDay > 22) && barking;
        return shouldWakeUp;
    }
}
