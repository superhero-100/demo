/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class ObjectDemo {

    public static void main(String[] args) {
        Student student = new Student();
        Student connedStudent = (Student) student.clone();
        System.err.println(connedStudent);
        System.err.println("Hashcode: " + student.hashCode());
    }

}

class Student implements Cloneable {

    @Override
    public Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            System.err.println("error occured clone not supported");
        } catch (Exception e) {
            System.err.println("exception occured unknown");
        }
        return new Student();
    }

    @Override
    public String toString() {
        return "toString called";
    }

}
