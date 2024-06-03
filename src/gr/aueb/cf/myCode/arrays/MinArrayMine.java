package gr.aueb.cf.myCode.arrays;
/**
 * Searches from an array the minValue and the Position of
 * @author Angelopoulos.D
 */
public class MinArrayMine {
    public static void main(String[] args) {
        int [] arr = {2, 4, -7, 1, -1, 5};
        int findMinValuePosition;

        findMinValuePosition = findMinValue(arr);

        System.out.printf("The minValue is %d and the position is %d "
                , arr[findMinValuePosition], (findMinValuePosition+1));
    }
    /**
     *  Searches the position of the MinValue
     *  Returns the position
     * @param arr data array
     * @return the position of MinValue
     */
    public static int findMinValue(int [] arr){
    if (arr == null || arr.length == 0) return -1;
    // should ensure that arr is not null and is not 0 length!

    int minValue = arr[0];
    int minPosition = 0;

         for (int i = 1; i < arr.length; i++ ){
             //start from i = 1 due to initialization of minValue 0
            if (arr[i] < minValue){
            minValue = arr[i];
            minPosition = i;
            }
        }
        return minPosition;
    }
}
