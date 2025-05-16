
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class Arrays {

    public static void main(String[] args) {
        // int[] arr=new int[5];
        // arr[0]=4;
        // int []arr=new int[5];
        // int arr[]=new int[5];

        // int arr[]=new int[]{};
        // int arr[]=new int[]{1,2,3};
        int arr[] = {1, 2, 3};

        //anonymous array
        System.err.println(java.util.Arrays.toString(new int[]{1, 2, 3}));

        for (int num : arr) {
            System.err.println("Num: " + num);
        }

        System.err.println("Length of arr: " + arr.length);

        // int[][] multiDimArr = new int[5][5];
        // int multiDimArr[][] = new int[5][];
        // multiDimArr[0]=new int[5];
        // int[] multiDimArr[] = new int[5][];
        // int[][] multiDimArr = new int[4][5];
        // jagged array
        // int[][] multiDimArr = {{1, 2}, {2, 3, 1}, {3, 6, 7, 8, 9}};
        // for (int[] subArr : multiDimArr) {
        //     for (int num : subArr) {
        //         System.err.print(num + "  ");
        //     }
        //     System.err.println("");
        // }
        int[] arr2 = arr.clone();
        int[] arr3 = new int[arr.length];
        System.arraycopy(arr, 0, arr3, 0, arr.length);
        System.err.println(java.util.Arrays.toString(arr2));
        System.err.println(java.util.Arrays.toString(arr3));

        // transpose of matrix
        int[][] mat = new int[][]{{1, 2}, {3, 4}, {5, 6}};
        int[][] transposeMat = new int[mat[0].length][mat.length];

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                transposeMat[j][i] = mat[i][j];
            }
        }

        for (int[] transposeMat1 : transposeMat) {
            for (int j = 0; j < transposeMat1.length; j++) {
                System.err.print(transposeMat1[j] + " ");
            }
            System.err.println("");
        }

        // Arrays  class util class    part of collections framework 
        System.err.println("35 is at: " + java.util.Arrays.binarySearch(new int[]{4, 5, 10, 12, 15, 20, 28, 30, 35, 40, 50, 55, 65, 80, 95, 100}, 35));
        System.err.println(java.util.Arrays.toString(java.util.Arrays.copyOf(new int[]{1, 2, 3}, 5)));

        int[] demoArr = {1, 2, 3, 6, 5, 4};
        new ArraySorter().sort(demoArr);
        System.err.println("Array Sorter:" + java.util.Arrays.toString(demoArr));

        

    }

}
