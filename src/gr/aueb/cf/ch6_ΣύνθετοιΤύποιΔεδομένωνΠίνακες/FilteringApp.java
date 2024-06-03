package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

/**
 * Filter an Array and return a new Array with Even Only.
 */
public class FilteringApp {
    public static void main(String[] args) {
        int[] arr = {4, 7, 8, 3, 56, 2, 89};
        int[] evenArr = filterEven(arr); //uses the method
        traverse(evenArr); // appears Arr
    }
    public static int[] filterEven(int[] arr) {
        if (arr == null || arr.length == 0) return new int[0];
        // we don't know the size of array and how many evens do we have.
        // First we count how many evens we have into arr

        int count = 0;
        for (int item : arr) {
            if (item % 2 == 0) { //Checks how many Evens found in arr
                count++;
            }
            // after we count evens into arr - we create a new array 'returnedArr' with length count.
            // and then we filter again Arr in order to itemize the returnedArr
        }
        int[] returnedArr = new int[count];
        count = 0;
        for (int item: arr) {
            if (item % 2 == 0) {
                returnedArr[count] = item; // for each even give an item value to returnedArr
                count++;
            }
        }
        return returnedArr; // returned the final Array only with Even
    }
    public static void traverse(int[] arr) {
        for (int item : arr) {
            System.out.print(item + " ");
        }
    }
}
