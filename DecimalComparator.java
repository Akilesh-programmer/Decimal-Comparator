public class DecimalComparator {

    // Compares decimal places upto 3 digits.
    public static boolean areEqualByThreeDecimalPlaces(double firstDecimalNumber, double secondDecimalNumber) {
        int slicedFirstDecimalNumber = (int) (firstDecimalNumber * 1000);
        int slicedSecondDecimalNumber = (int) (secondDecimalNumber * 1000);
        if(slicedSecondDecimalNumber == slicedFirstDecimalNumber) {
            return true;
        } else {
            return false;
        }
    }
}
