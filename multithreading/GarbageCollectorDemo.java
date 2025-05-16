/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class GarbageCollectorDemo {

    public static void main(String[] args) {
        Student stud1 = new Student(1, "hello");
        Student stud2 = new Student(2, "hello");

        stud1 = null;
        System.gc();
    }

}

class Student {

    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    protected void finalize() {
        System.out.println("clearing object:" + id + " " + name);
    }

}