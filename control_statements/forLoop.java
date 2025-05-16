
import java.util.Arrays;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class forLoop {

    public static void main(String[] args) {
        // for loop
        for (int i = 0; i < 10; i++) {
            System.err.println("for loop number: " + i);
        }

        int[] arr = {1, 3, 2, 5};
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    switchPositions(arr, j, j + 1);
                }
            }
        }
        System.err.println(Arrays.toString(arr));

    }

    public static void switchPositions(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

}
