package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

/**
 * App finds the MAX position within a position range
 */
public class Homework1Ch6 {
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,2,3,4,2,4,5};

        int maxPosition = getMaxPosition(arr, 1, 5 );

        System.out.println("Max Position is: " + maxPosition);


    }
    public static int getMaxPosition(int[] arr, int low, int high) {
        if (low > high) {
            throw new IllegalArgumentException("Low should not be greater than high");
        }
        if (low < 0 || high >= arr.length) {
            throw new IndexOutOfBoundsException("Low and High must be within array");
        }
        int maxPosition = low;
        for (int i = low; i <= high; i++ ) {
            if (arr[i] > arr[maxPosition]) {
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}
