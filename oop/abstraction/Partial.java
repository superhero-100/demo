

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class Partial {

    public static void main(String[] args) {
        Computer computer = new Laptop();
        computer.powerOn();
    }

}

abstract class Computer {

    public abstract void powerOn();

    public void powerOff() {
        System.err.println("shut down...");
    }
}

class Laptop extends Computer {

    @Override
    public void powerOn() {
        System.err.println("power on laptop");
    }
}
