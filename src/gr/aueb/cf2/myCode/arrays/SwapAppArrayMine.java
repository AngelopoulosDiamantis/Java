package gr.aueb.cf.myCode.arrays;

/**
 * Swap two values of an array
 * Change remain and out of method (by references changes)
 * @author Angelopoulos.D
 */
public class SwapAppArrayMine {
    public static void main(String[] args) {
        int [] arr = {5, 7};

        swap(arr);

        System.out.printf("Position 1 is %d, Position 2 is %d", arr[0], arr[1]);
        //users knows 1, 2, 3 not 0, 1, 2 the actual order od arrays
    }

    /**
     * Swap two values into array
     * @param arr two values array
     */
    public static void swap(int [] arr) {
        if (arr == null || arr.length != 2) return;

        int temporaryValue = arr[0]; //we give this value in order to exchange
        arr[0] = arr [1];
        arr [1] = temporaryValue;
        // swap values and remain to out not only inside the method
    }
}
