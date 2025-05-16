/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/**
 *
 * @author tagline
 */
public class ByteStream {

    public static void main(String[] args) {
        try {
            // byte stream
            FileOutputStream fileOutputStream = new FileOutputStream("./demo.txt");
            fileOutputStream.write(65);
            fileOutputStream.close();

            // fis.read==-1 then stop file end reached
            FileInputStream fileInputStream = new FileInputStream("./demo.txt");
            int a = fileInputStream.read();
            System.out.println("a:" + a);
            fileInputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            // byte stream
            BufferedOutputStream OutputStream = new BufferedOutputStream(new FileOutputStream("./demo.txt"));
            OutputStream.write(65);
            OutputStream.close();

            // fis.read==-1 then stop file end reached
            BufferedInputStream InputStream = new BufferedInputStream(new FileInputStream("./demo.txt"));
            int a = InputStream.read();
            System.out.println("a:" + a);
            InputStream.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // byte array streams
        // String input = "hello world";
        // byte[] byteArray = input.getBytes();

        // ByteArrayInputStream bais = new ByteArrayInputStream(byteArray);
        // ByteArrayOutputStream baos = new ByteArrayOutputStream();
        // int ch;
        // while ((ch = bais.read()) != -1) {
        // baos.write(Character.toUpperCase(ch));
        // }
        // String result = baos.toString();

        // System.out.println("Input:" + input);
        // System.out.println("Output:" + result);

        try {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            DataOutputStream dos = new DataOutputStream(baos);

            dos.writeBoolean(true);
            byte[] byteArray = baos.toByteArray();

            DataInputStream dis = new DataInputStream(new ByteArrayInputStream(byteArray));

            System.out.println(dis.readBoolean());
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            Person person = new Person("sahil", 10);
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(baos);

            oos.writeObject(person);
            byte[] byteArray = baos.toByteArray();

            ObjectInputStream dis = new ObjectInputStream(new ByteArrayInputStream(byteArray));

            System.out.println((Person) dis.readObject());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

}

class Person implements Serializable {
    String name;
    int age;

    Person(String n, int a) {
        name = n;
        age = a;
    }

    @Override
    public String toString() {
        return "Student{ name:" + name + ", age:" + age + " }";
    }
}
