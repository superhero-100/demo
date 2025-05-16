/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class OverRiding {

    public static void main(String[] args) {
        Mobile mobile = new IPhone();
        mobile.ring();
    }

}

class Mobile {

    public void ring() {
        System.err.println("....");
    }
}

class IPhone extends Mobile {

    @Override
    public void ring() {
        System.err.println(" . . . . .");
    }
}
