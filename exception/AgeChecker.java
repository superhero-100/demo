/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class AgeChecker {

    public static void main(String[] args) {
        checkIsMinor(0);

        try {
            checkIsMinor(0);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean checkIsMinor(int age) throws ArithmeticException {
        if (age <= 0) {
            throw new ArithmeticException("age can not 0 or less then 0");
        } else if (age < 18) {
            return true;
        } else {
            return false;
        }
    }

}
