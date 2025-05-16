
import java.io.FileReader;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class exceptionDemo {

    public static void main(String[] args) {

        // int num = 100 / 0;
        // try {
        //     int num = 100 / 0;
        // } catch (ArithmeticException e) {
        //     e.printStackTrace();
        // }
        // multiple catch block
        // try {
        //     // int num = 100 / 0;
        //     String str = null;
        //     System.out.println(str.length());
        // } catch (ArithmeticException e) {
        //     e.printStackTrace();
        // } catch (NullPointerException e) {
        //     e.printStackTrace();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("Finally block executed");
        // }
        // nested
        // try {
        //     try {
        //         String str = null;
        //         System.out.println(str.length());
        //     } catch (NullPointerException e) {
        //         e.printStackTrace();
        //     }
        //     int num = 100 / 0;
        // } catch (ArithmeticException e) {
        //     e.printStackTrace();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // } finally {
        //     System.out.println("Finally block executed");
        // }
        // throwException();
        // try {
        //     FileReader file = new FileReader("data.txt");
        // } catch (IOException e) {
        //     e.printStackTrace();
        // }
        // try {
        //     throwCheckedException();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // throwUncheckedException();
        throwCustomException();

    }

    public static void throwException() {
        try {
            String str = null;
            // System.out.println(str.length());
            return;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            System.err.println("finally executed");
        }
    }

    public static void throwCheckedException() throws Exception {
        FileReader file = new FileReader("data.txt");
    }

    public static void throwUncheckedException() throws RuntimeException {
        int num = 2 / 0;
    }

    public static void throwCustomException() throws RuntimeException {
        throw new EntityNotFoundException("student not found.");
    }

}
