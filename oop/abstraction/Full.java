/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class Full {

    public static void main(String[] args) {
        Computer computer = new Laptop();
        computer.powerOn();
    }

}

interface Computer {

    public void powerOn();
}

class Laptop implements Computer {

    @Override
    public void powerOn() {
        System.err.println("power on laptop");
    }

    public void powerOff() {
        System.err.println("shut down...");
    }

}
