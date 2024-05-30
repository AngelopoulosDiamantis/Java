package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

/**
 * Selection Sort
 */
public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {8, 34, 5, 1, 2, 7, 3, 9, 20};
        selectionSort(arr);

        traverseArray(arr);
    }
    /**
     * Sorting based on selection Sort
     * Time Complexity 0(n^2)
     *
     * @param arr the input array
     */
    public static void selectionSort(int[] arr) {
        if (arr ==null) return;
        // return works "like" break;
        int min;
        int minPosition;

        for (int i = 0; i < arr.length-1; i++) {
            minPosition = i;
            min = arr[i];

            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < min) {
                    min = arr[j];
                    minPosition = j;
                }
            }
            swap (arr, i, minPosition);
        }
    }
    public static void swap(int [] arr, int i, int j){
        int temporary = arr[i];
        arr[i] = arr[j];
        arr[j] = temporary;
    }
    public static void traverseArray(int[] arr) {
        for (int element: arr) {
            System.out.print(element +" ");
        }
    }
}

