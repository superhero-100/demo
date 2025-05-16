
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;

/**
 *
 * @author tagline
 */
public class FileDemo {

    public static void main(String[] args) {
        // try {
        // File file = new File("./hello.txt");
        // if (file.createNewFile()) {
        // System.out.println(file.getName());
        // }

        // FileWriter fileWriter = new FileWriter(file);
        // fileWriter.write("hello world");
        // fileWriter.close();

        // FileReader fileReader = new FileReader(file);
        // int ch;
        // while ((ch = fileReader.read()) != -1) {
        // System.out.print((char) ch);
        // }

        // fileReader.close();

        // file.delete();
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        // try {
        // File file = new File("./");
        // String filenames[] = file.list();
        // for (String filename : filenames) {
        // System.out.println(filename);
        // }
        // } catch (Exception e) {
        // e.printStackTrace();
        // }

        try {
            File file = new File("txt1.txt");
            file.createNewFile();
            FileOutputStream fos = new FileOutputStream("txt2.txt", true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            BufferedReader file = new BufferedReader(new FileReader(new File("hello.txt")));
            String str;
            while ((str = file.readLine()) != null) {
                System.out.println(str);
            }
            file.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }

}
