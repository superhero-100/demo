/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class ThreadDemo {

    public static void main(String[] args) {
        // System.out.println("hello");
        // System.out.println(Thread.currentThread().getName());
        // try{
        // Thread.sleep(5000);
        // }catch(InterruptedException ex){
        // ex.printStackTrace();
        // }
        // System.out.println(Thread.currentThread().getName());

        // with and without join diff
        Thread t = new Thread("demoThread") {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.print("i:" + i + "  ");
                }
            }
        };

        t.start();

        // try{
        // t.join();
        // }catch(Exception e){
        // e.printStackTrace();
        // }

        // System.out.println("hello \n\n");
        // // terminated after the main thread terminates
        // Thread dt = new Thread() {
        //     public void run() {
        //         for (int i = 0; i < 100; i++) {
        //             System.out.println("i" + i);
        //         }
        //     }
        // };
        // // dt.setDaemon(true);
        // dt.start();

        // System.out.println("main ended");
    }

}
