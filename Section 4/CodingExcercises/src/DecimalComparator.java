public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        return (int) (a * 1000) == (int) (b * 1000);

    }
}
