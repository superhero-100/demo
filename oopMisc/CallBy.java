/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class CallBy {

    public static void main(String[] args) {
        Number num1 = new Number();
        int num2 = 10;

        change(num1, num2);

        System.err.println("num1: " + num1);
        System.err.println("num2: " + num2);
    }

    public static void change(Number num1, int num2) {
        num1.num = 20;
        num2 = 20;
    }

}

class Number {

    public int num;

    public Number() {
        num = 10;
    }

    @Override
    public String toString() {
        return String.valueOf(num);
    }

}
