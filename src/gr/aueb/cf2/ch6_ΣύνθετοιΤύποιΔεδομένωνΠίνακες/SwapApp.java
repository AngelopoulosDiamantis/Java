package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

/**
 * Mutually interchanges the two values
 */
public class SwapApp {
    public static void main(String[] args) {

        int [] arr = {1, 10};
        swap(arr);

        System.out.printf("arr[0] = %d, arr[1] = %d", arr[0], arr[1]);

    }
    public static void swap(int[] arr) {
        if (arr == null || arr.length !=2) return; //works "like" break

        int tmp = arr[0]; //tmp temporary
        arr[0] = arr[1];
        arr[1] = tmp;
    }
}
