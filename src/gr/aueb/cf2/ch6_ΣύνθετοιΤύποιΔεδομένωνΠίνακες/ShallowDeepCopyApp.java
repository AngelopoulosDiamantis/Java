//package gr.aueb.cf.ch6;
//
//import java.util.Arrays;
//
//public class ShallowDeepCopyApp {
//    public static void main(String[] args) {
//        int [][] grid = {{1, 2, 3}, {4, 5, 6}};
//        int[][] gridCopyRef = copyReference(grid);
//        //shallow copy
//        gridCopyRef[0][0] = 100;
//        traverse(grid);
//
//
//    }
//    public static int[][] shalowCopy(int[][] arr){
//        return Arrays.copyOf(arr, arr.length);
//    }
//
//    public static int[][] copyReference(int[][] arr){
//        return arr;
//    }
//
//    public static void traverse(int [][] arr){
//        for (int[] row : arr) {
//            for (int col : row) {
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }
//    }
//
//    public static void deepCopy(int[][] arr) {
//        int[][] arrToReturn = new int[arr.length][];
//
//        for (int i = 0; i < arr.length; i++){
//            arrToReturn[i] = new int[arr[i].length];
////            for (int j = 0; j < arr[i].length; j++){
////                arrToReturn[i][j] = arr [i][j];
//            }
//            arrToReturn[i] = Arrays.copyOf(arr [i], arr[i].length);
//
//        }
//    }
