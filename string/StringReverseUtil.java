/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class StringReverseUtil {

    public String reverse(String str) {
        String newStr = "";
        for (int i = 0; i < str.length(); i++) {
            newStr += str.charAt(str.length() - i - 1);
        }
        return newStr;
    }

    public static void main(String[] args) {
        StringReverseUtil util = new StringReverseUtil();
        System.out.println(util.reverse("str"));
    }

}
