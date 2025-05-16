/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class doWhileLoop {

    public static void main(String[] args) {

        int i = 0;
        // do while
        do {
            System.err.println("do while loop number: " + i);
            i--;
        } while (i > 0);

        int k = 5;
        do {
            int j = k;
            do {
                System.err.print("0");
                j--;
            } while (j > 0);
            k--;
            System.err.println("");
        } while (k > 0);

    }
}
