package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

public class RedusingApp {
    public static void main(String[] args) {

    }

    /**
     * reduces the input arr to sum of its elements
     * @param arr
     * @return
     */
    public static int getSum (int[] arr){
        if (arr == null || arr.length ==0) return -1;
        int sum = 0;

        for (int item : arr){
            sum += item;
        }
        return sum;
    }
    public static double getAvg (int[] arr){
        if (arr == null || arr.length ==0) return -1;
        int sum = 0;

        for (int item : arr){
            sum += item;
        }
        return (double) sum / arr.length;
    }
}
