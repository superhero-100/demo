
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class CharStream {

    public static void main(String[] args) {

        try {
            // byte stream
            FileWriter fw = new FileWriter("./demo.txt");
            fw.write("hello world");
            fw.close();

            // fis.read==-1 then stop file end reached
            FileReader fr = new FileReader("./demo.txt");
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // byte stream
            BufferedWriter fw = new BufferedWriter(new FileWriter("./demo.txt"));
            fw.write("hello world");
            fw.close();

            // fis.read==-1 then stop file end reached
            BufferedReader fr = new BufferedReader(new FileReader("./demo.txt"));
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.print((char) ch);
            }
            fr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // byte stream
            OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("./demo.txt"), "UTF-8");
            osw.write("नमस्ते");
            osw.close();

            // fis.read==-1 then stop file end reached
            InputStreamReader isr = new InputStreamReader(new FileInputStream("./demo.txt"), "UTF-8");
            int ch;
            while ((ch = isr.read()) != -1) {
                System.out.print((char) ch);
            }
            isr.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        

    }

}
