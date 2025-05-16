

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class Multilevel {

    public static void main(String[] args) {

        Desktop desktop = new Desktop();
        desktop.powerOnDesktop();

    }

}

class ElectronicDevice {

    public void powerOn() {
        System.err.println("power on..");
    }
}

class Computer extends ElectronicDevice {

    public void powerOnComputer() {
        this.powerOn();
        System.err.println("power on computer..");
    }
}

class Desktop extends Computer {

    public void powerOnDesktop() {
        this.powerOnComputer();
        System.err.println("power on desktop..");
    }
}
