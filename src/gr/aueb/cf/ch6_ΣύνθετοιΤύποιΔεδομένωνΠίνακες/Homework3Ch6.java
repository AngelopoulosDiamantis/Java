package gr.aueb.cf.ch6_ΣύνθετοιΤύποιΔεδομένωνΠίνακες;

import java.util.Arrays;

public class Homework3Ch6 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -4, -5, 7, 6, -4};
        int searchFor = 3;
        int[] doubleArr = mapArray(arr);



        //1
        System.out.println(" :" + searchInt(arr, searchFor));
        //2
        printEvenNumbers(arr);
        //3
        System.out.println(" :" + Arrays.toString(doubleArr));
        //4
        System.out.println("The Array includes at least one Positive :" + checkForPositiveNumber(arr));
        //5
        System.out.println("The Array includes at least one Negative :" + checkForNegativeNumber(arr));
    }

    public static int searchInt(int[] arr, int value) {
        int getPosition = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) {
                getPosition = i;
            }
        }
        return getPosition;

    }

    public static void printEvenNumbers(int[] array) {
        for (int number : array) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    public static int[] mapArray(int[] arr) {
        int[] doubleArr = new int[arr.length];

        for (int i = 1; i < arr.length; i++) {
            doubleArr[i] = arr[i] * 2;

        }
        return doubleArr;
    }

    public static boolean checkForPositiveNumber(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                return true;
            }
        }
        return false;
    }
        public static boolean checkForNegativeNumber ( int[] arr){
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 0) {
                    return true;
                }
            }
            return false;
        }

    }
