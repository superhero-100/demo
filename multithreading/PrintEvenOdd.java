/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class PrintEvenOdd {

    public static void main(String[] args) {

        Printer p = new Printer(50);

        ThreadGroup tg = new ThreadGroup("printer");

        Thread evenThread = new Thread(tg, () -> {
            try {
                p.printEven();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "even");

        Thread oddThread = new Thread(tg, () -> {
            try {
                p.printOdd();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }, "odd");

        evenThread.start();
        oddThread.start();

    }

}

class Printer {

    private int counter = 1;
    private final int MAX;

    public Printer(int max) {
        this.MAX = max;
    }

    public synchronized void printEven() throws InterruptedException {
        while (counter < MAX) {
            while (counter % 2 != 0) {
                wait();
            }
            System.out.println("Even number:" + counter++);
            notify();
        }
    }

    public synchronized void printOdd() throws InterruptedException {
        while (counter < MAX) {
            while (counter % 2 != 1) {
                wait();
            }
            System.out.println("Odd number:" + counter++);
            notify();
        }
    }

}