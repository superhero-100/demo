/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class switchCase {

    public static void main(String[] args) {

        //rule switch new systex for switch 
        // TaskStatus ts = TaskStatus.valueOf(scanner.nextLine());
        TaskStatus ts = TaskStatus.COMPLETE;
        switch (ts) {
            case COMPLETE ->
                System.err.println("work is complete.");
            case INCOMPLETE ->
                System.err.println("work is incomplete.");
            case PENDING ->
                System.err.println("work is pending");
            default ->
                System.err.println("");
        }

        //old switch syntax
        switch (ts) {
            case COMPLETE:
                System.err.println("work is complete.");
                System.err.println("multiple st");
                break;
            case INCOMPLETE:
                System.err.println("work is incomplete.");
                break;
            case PENDING:
                System.err.println("work is pending");
                break;
            default:
                System.err.println("");
        }
    }

    public enum TaskStatus {
        INCOMPLETE, PENDING, COMPLETE;
    }

}
