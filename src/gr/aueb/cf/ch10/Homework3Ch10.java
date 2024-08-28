package gr.aueb.cf.ch10;
import java.util.Arrays;
public class Homework3Ch10 {
    public static void main(String[] args) {
        int[][] original = {{1, 2}, {3, 4}};

        // Shallow copy
        int[][] shallowCopy = shallowCopy(original);
        shallowCopy[0][0] = 99;
        System.out.println("Original after shallow copy modification: " + Arrays.deepToString(original));

        // Deep copy
        int[][] deepCopy = deepCopy(original);
        deepCopy[0][0] = 100;
        System.out.println("Original after deep copy modification: " + Arrays.deepToString(original));
    }

    public static int[][] shallowCopy(int[][] arr) {
        return Arrays.copyOf(arr, arr.length);
    }

    public static int[][] deepCopy(int[][] arr) {
        int[][] copy = new int[arr.length][];
        for (int i = 0; i < arr.length; i++) {
            copy[i] = Arrays.copyOf(arr[i], arr[i].length);
        }
        return copy;
    }
}
