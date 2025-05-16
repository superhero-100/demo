
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class UtilClasses {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
        System.out.println(Collections.binarySearch(list, 1));

        // List.of
        // Map.of
        // Set.of
        // creates the unmodifiable collection or you can use the Collections class to
        // create these also
        // Unsupported Action Ex

        // synchronized impls of collection and unmodificaed collection impls

        int[] arr = new int[] { 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.fill(arr, 5);
        System.out.println(Arrays.toString(arr));

        Integer[] integerArr = new Integer[] { 1, 2, 3 };
        List<Integer> integerList = Arrays.asList(integerArr);
        System.out.println(integerList);


        // copyOf and equals   
    }

}
