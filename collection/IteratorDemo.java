
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class IteratorDemo {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(List.of(1, 2, 3, 4));
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()) {
            Integer elem = iterator.next();
            System.out.println(elem);
            if (elem == 3) {
                // original DS modified if modifying iterator
                iterator.remove();
            }
        }
        System.out.println("list:" + list);

        // supports previous
        ListIterator<Integer> listIterator = new ArrayList<>(List.of(1, 2, 3, 4)).listIterator();
        while (listIterator.hasNext()) {
            Integer elem = listIterator.next();
            System.out.println(elem);
        }
        while (listIterator.hasPrevious()) {
            Integer elem = listIterator.previous();
            System.out.println(elem);
        }

        // for pararal easy execution
        Spliterator<Integer> spliterator1 = new ArrayList<>(List.of(1, 2, 3, 4)).spliterator();
        Spliterator<Integer> spliterator2 = spliterator1.trySplit();

        spliterator2.forEachRemaining(System.out::println);
        spliterator1.forEachRemaining(System.out::println);

    }

}
