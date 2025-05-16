/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class OverLoading {

    public static void main(String[] args) {
        Operation op = new Operation();
        System.err.println(op.addition(3, 7));
        System.err.println(op.addition("a", "b"));
    }

}

class Operation {

    public int addition(int a, int b) {
        return a + b;
    }

    public String addition(String a, String b) {
        return a + b;
    }

}
