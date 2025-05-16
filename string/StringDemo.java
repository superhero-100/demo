

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class StringDemo {

    public static void main(String[] args) {
        String str1 = "hello world";
        String str2 = new String("hello world");

        StringBuilder sb = new StringBuilder("hello");
        sb.append("736");
        sb.append('a');
        System.out.println(sb);
        System.out.println(sb.charAt(1));
        System.out.println(sb.substring(5));
        sb.reverse();
        System.out.println(sb);

        // parent interface of the string stringbuilder and buffer     provides methods
        CharSequence cs = "hello";

        StringBuffer sb2 = new StringBuffer("hello");
        sb2.append("b");
        System.out.println("string buffer:" + sb2);

        // comparision
        System.out.println(str1 == str2);
        System.out.println(str1 == "hello world");

        String str3 = str1 + "  " + str2;
        String str4 = str1.concat(str3);
        System.out.println("Concat (via +):" + str3);

        String str5 = String.join(str1, str2);
        System.out.println("str5:" + str5);

        System.out.println(String.format("str1: %s", str1));

        System.out.println("String length:" + str1.length());
        System.out.println("String index of 'world':" + str1.indexOf("world"));

        String str6 = str1.replace("hello", "HELLO");
        System.err.println("str6:" + str6);

        System.err.println("helloworld".substring(1, 5));

        
    }

}
