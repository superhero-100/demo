/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class enumDemo {

    public static void main(String[] args) {
        // Color c = Color.BLUE;

        for (Color color : Color.values()) {
            System.err.println("color:" + color.name());
            System.err.println("color:" + color.getColorString());
        }

        System.err.println(Color.valueOf("RED"));

        
    }
}

enum Color {

    RED("R"), GREEN("G"), BLUE("B");

    private final String c;

    private Color(String c) {
        this.c = c;
    }

    public String getColorString() {
        return c;
    }

}
