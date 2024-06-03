package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;
public class SymmetricArrayApp {
    public static void main(String[] args) {
        int[] arr = {1, 3, 3, 2, 1};

        System.out.println("Is symmetric:" + isSymmetric(arr));
    }
    public static boolean isSymmetric(int[] arr) {

        boolean symmetric = false;

        for (int i = 0, j = arr.length - 1; i < j; i++, j--) {
            if (arr[i] != arr[j]) {
                return false;
            }
        }
        return true;
    }
}
