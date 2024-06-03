package gr.aueb.cf.myCode.arrays;
/**
 * Searches from an array the maxValue and the Position of
 * @author Angelopoulos.D
 */
public class MaxArrayMine {
    public static void main(String[] args) {
        int [] arr = {2, 4, -7, 1, -1, 5};
        int findMaxValuePosition;

        findMaxValuePosition = findMaxValue(arr);

        System.out.printf("The maxValue is %d and the position is %d "
                , arr[findMaxValuePosition], (findMaxValuePosition+1));
    }
    /**
     *  Searches the position of the MaxValue
     *  Returns the position
     * @param arr data array
     * @return the position of MaxValue
     */
    public static int findMaxValue(int [] arr){
        if (arr == null || arr.length == 0) return -1;
        // should ensure that arr is not null and is not 0 length!

        int maxValue = arr[0];
        int maxPosition = 0;

        for (int i = 1; i < arr.length; i++ ){
            //start from i = 1 due to initialization of maxValue 0
            if (arr[i] > maxValue){
                maxValue = arr[i];
                maxPosition = i;
            }
        }
        return maxPosition;
    }
}