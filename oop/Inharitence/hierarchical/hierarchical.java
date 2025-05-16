/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class Hierarchical {

    public static void main(String[] args) {

        Desktop desktop = new Desktop();
        desktop.powerOnDesktop();

        Laptop laptop = new Laptop();
        laptop.powerOnLaptop();

    }

}

class Computer {

    public void powerOnComputer() {
        System.err.println("power on computer..");
    }
}

class Desktop extends Computer {

    public void powerOnDesktop() {
        this.powerOnComputer();
        System.err.println("power on desktop..");
    }
}

class Laptop extends Computer {

    public void powerOnLaptop() {
        this.powerOnComputer();
        System.err.println("power on laptop..");
    }
}
