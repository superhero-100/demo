
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class QueueDemo {

    public static void main(String[] args) {

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(10);
        queue.add(20);
        queue.poll();
        queue.remove(20);
        System.out.println(queue);

        Deque<Integer> deque = new LinkedList<>();
        deque.offerFirst(10);
        deque.offerLast(20);
        deque.removeLast();
        System.out.println(deque);

        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        arrayDeque.offer(10);
        arrayDeque.remove();

        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.offer(10);
        linkedList.remove();

        // sorting order      
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.offer(10);
        priorityQueue.remove();

    }

}
