package gr.aueb.cf.myCode.arrays;

import java.util.Scanner;

/**
 * Searches the position of a value into array
 * @author Angelopoulos.D
 */

public class SearchAppMine {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] value = {1, 2, 4, 3, 5, 6, 7, 8, 9, 10, 11, 12};
        int insertMonth;
        int getPositionValue;

        System.out.println("Please insert a value int");
        insertMonth = in.nextInt();

        getPositionValue = getPosition(value, insertMonth);

        System.out.printf("The inserted value is in %d position", getPositionValue+1);
        // The user will see position + 1 in order to understand.
    }

    /**
     * Search into arr for value value
     * if find give position
     * if not return -1 error
     * @param arr array with data
     * @param value insert value
     * @return the position of the value
     */
    public static int getPosition(int[] arr, int value) {
        int positionValue = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value){
                positionValue = i;
                break;
            }
        }
        return positionValue;
    }
}
