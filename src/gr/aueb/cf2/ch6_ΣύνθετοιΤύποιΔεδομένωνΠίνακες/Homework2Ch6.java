package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

/**
 * App finds the Min position and the Second Min Position within an array
 */
public class Homework2Ch6 {
    public static void main(String[] args) {
        int[] arr = {2, 7, 4, 7, 9};

        int secondMiPosition = getSecondMinPosition(arr);

        System.out.println("Second Min Position: " + secondMiPosition);

    }

    public static int getSecondMinPosition(int[] arr) {
        int minPosition = 0;
        int secondMinPosition = 1;

        if (arr.length < 2){
            return -1;
        }

        if (arr[minPosition] > arr[secondMinPosition]){
            secondMinPosition = 0;
            minPosition = 1;
        }

        for (int i = 2; i < arr.length; i++) {
            if (arr[i] < arr[minPosition]) {
                secondMinPosition = minPosition;
                minPosition = i;


            } else if (arr[i] < arr[secondMinPosition] && i != minPosition) {
                secondMinPosition = i;
            }
        }
        return secondMinPosition;
    }
}

