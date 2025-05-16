
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentNavigableMap;
import java.util.concurrent.ConcurrentSkipListMap;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.LinkedTransferQueue;
import java.util.concurrent.PriorityBlockingQueue;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class ConcurrentCollections {

    public static void main(String[] args) {

        // bounded Ds and unbounded Ds

        try {
            BlockingQueue<Integer> blockingQueue = new ArrayBlockingQueue<>(2);
            blockingQueue.put(10);
            blockingQueue.put(20);
            // blockingQueue.put(30);
            System.out.println(blockingQueue.take());
            System.out.println(blockingQueue.take());
            // System.out.println(blockingQueue.take());
        } catch (Exception e) {
            e.printStackTrace();
        }

        ArrayBlockingQueue<Integer> arrayBlockingQueue = new ArrayBlockingQueue<>(0);
        LinkedBlockingQueue<Integer> linkedBlockingQueue = new LinkedBlockingQueue<>(0);
        PriorityBlockingQueue<Integer> priorityBlockingQueue = new PriorityBlockingQueue<>();

        // SynchronousQueue each producer waits untill consumer is ready to get data and
        // no internal storage is used in syn queue
        // transfer linked queue is mostly same diff is it takes capacity transfer
        // linked queue is unbounded
        // consumer waits untill producer produces data one to one
        // DelayQueue consumer wait specified seconds before receiving the data

        LinkedTransferQueue<Integer> linkedTransferQueue = new LinkedTransferQueue<>();

        BlockingDeque<Integer> deque = new LinkedBlockingDeque<>();
        LinkedBlockingDeque<Integer> linkedBlockingDeque = new LinkedBlockingDeque<>();

        // threadsafe
        ConcurrentHashMap<Integer, String> concurrentHashMap = new ConcurrentHashMap<>();

        // sorted not uses tree uses skiplist
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();
        map.put(10, "Ten");
        map.put(5, "Five");
        map.put(20, "Twenty");

        ConcurrentNavigableMap<Integer, String> concurrentNavigableMap = new ConcurrentSkipListMap<>();


        // no concurrent modification ex 
        // CopyOnWriteArrayList 
        // CopyOnWriteArraySet

        

    }

}
