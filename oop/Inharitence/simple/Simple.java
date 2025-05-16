/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class Simple {

    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.doWork();

        Programmer programmer = new Programmer();
        programmer.doWork();
        programmer.writeCode();

    }

}

class Employee {

    public void doWork() {
        System.err.println("starting work..");
    }

}

class Programmer extends Employee {

    public void writeCode() {
        System.err.println("Writing code..");
    }

}
