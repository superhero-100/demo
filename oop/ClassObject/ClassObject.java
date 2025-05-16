

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class ClassObject {

    public static void main(String[] args) {

        Car car = new Car();
        System.err.println("car speed:" + car.speed);
        car.changeSpeed(20);
        System.err.println("car speed:" + car.speed);
    }

}

class Car {

    public int speed = 40;

    public void changeSpeed(int speed) {
        this.speed = speed;
    }

    public Car() {
        System.err.println("Constructor called");
    }

    public Car(int speed) {
        this.speed = speed;
        System.err.println("parameterized constructor called");
    }
}
