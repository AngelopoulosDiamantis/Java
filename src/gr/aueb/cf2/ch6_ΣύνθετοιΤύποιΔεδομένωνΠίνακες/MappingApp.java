package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

public class MappingApp {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int[] mappedArray = mapDouble(arr);
        traverse(mappedArray);
    }
    public static int[] mapDouble(int[] arr){
        int[] arrayToReturn = new int[arr.length];

        for (int i = 0; i  < arr.length; i++){
            arrayToReturn[i] = arr[i] * 2;
        }
        return arrayToReturn;
    }
    public static void traverse(int[] arr){
        for (int item: arr){
            System.out.print(item + " ");
        }
    }
}
