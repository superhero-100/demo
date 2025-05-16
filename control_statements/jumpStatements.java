/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class jumpStatements {

    public static void main(String[] args) {

        // to break recent loop just normallly use break;
        // to skip iteraion use continue
        // with lable          break and continue
        a:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == 2) {
                    break a;
                }
                System.err.println("j:" + j + "   " + "k: " + k);
            }
        }
        System.err.println("|");
        a:
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == 2) {
                    continue a;
                }
                System.err.println("j:" + j + "   " + "k: " + k);
            }
        }

        // without lable          break and continue
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == 2) {
                    break;
                }
                System.err.println("j:" + j + "   " + "k: " + k);
            }
        }
        System.err.println("|");
        for (int j = 0; j < 5; j++) {
            for (int k = 0; k < 5; k++) {
                if (j == 2) {
                    continue;
                }
                System.err.println("j:" + j + "   " + "k: " + k);
            }
        }

    }

}
