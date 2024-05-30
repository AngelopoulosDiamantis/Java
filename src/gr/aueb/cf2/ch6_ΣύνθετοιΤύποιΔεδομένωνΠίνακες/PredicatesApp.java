package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

/**
 * Predicates are boolean methods
 */
public class PredicatesApp {
    public static void main(String[] args) {
        int[] arr = {-2, -1, 3, -6};
        boolean checkForPositive = hasOnePositive(arr);
        System.out.println("The Arr include at least an positive: " + checkForPositive);

    }

    /**
     * Checks if there is an int into arr
     * returns true or false
     *
     * @param arr the input array
     * @return true, if there is at least one positive
     */
    public static boolean hasOnePositive(int[] arr) {
        boolean hasPositive = false;

        for (int item : arr) {
            if (item > 0) {
                hasPositive = true;
                break;
            }
        }
        return hasPositive;
    }

    // if we want to check if all item are positives
    public static boolean allArePositive(int[] arr) {
        int count = 0;
        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count == arr.length;
    }
    // if we want to check Less Than N times positive
    public static boolean areLTNPositive(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item > 0) {
                count++;
            }
        }
        return count <= threshold;
    }

    public static boolean areGTEven(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0) {
                count++;
            }
        }
        return count >= threshold;
    }
    public static boolean areGTOdd(int[] arr, int threshold) {
        int count = 0;
        for (int item : arr) {
            if (item % 2 != 0) {
                count++;
            }
        }
        return count >= threshold;
    }

    public static boolean areSameEnding(int[] arr, int threshold) {
        int[] endings = new int[10];
        boolean sameEnding = false;

        for (int item : arr) {

            endings[item % 10]++;
        }
        for (int item : endings) {
            if (item >= threshold) {
                sameEnding = true;
                break;
            }
        }
        return sameEnding;
    }

    public static boolean areSameGroupOfTen(int[] arr, int threshold) {
        int[] tens = new int[10];
        boolean sameTen = false;

        for (int item : arr) {

            tens[item / 10]++;
        }
        for (int item : tens) {
            if (item >= threshold) {
                sameTen = true;
                break;
            }
        }
        return sameTen;
    }

}
