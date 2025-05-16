/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class Multiple {

    public static void main(String[] args) {

        codeRunner cr = new codeRunner();
        cr.runCode();

    }

}

interface C {

    void runCode();
}

interface Java {

    void runCode();
}

class codeRunner implements C, Java {

    @Override
    public void runCode() {
        System.err.println("Running code");
    }

}
