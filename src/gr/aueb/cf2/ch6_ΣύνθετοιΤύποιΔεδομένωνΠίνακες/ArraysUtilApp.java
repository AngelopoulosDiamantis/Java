package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

import java.util.Arrays;

public class ArraysUtilApp {
    public static void main(String[] args) {
        int[] arr = {5, 4, 9, 3, 12, 1};
        int[] arrayCopy;
        int[] arraySecondCopy;

        //sort Array
        Arrays.sort(arr);
        traverse(arr);
        System.out.println();
        //Copy Array
        arrayCopy = Arrays.copyOf(arr, arr.length);
        traverse(arrayCopy);
        System.out.println();
        //Range Copy
        arraySecondCopy = Arrays.copyOfRange(arr, 1, arr.length);
        traverse(arraySecondCopy);

    }

    public static void traverse (int[] arr) {
        for (int item : arr) {
            System.out.print(item+ " ");
        }
    }

}
