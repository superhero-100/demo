
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class SetDemo {

    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();
        set.add(10);
        set.remove(10);

        HashSet<Integer> hashSet = new HashSet<>();
        hashSet.add(10);
        hashSet.remove(10);

        // extends hashset
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.remove(10);

        EnumSet<Color> enumSet = EnumSet.of(Color.RED, Color.GREEN, Color.BLUE);
        enumSet.remove(Color.BLUE);
        System.out.println(enumSet);

        // maintains values in natural sorting orer or custon comparator order
        // implements sortedSet and navigableSet interfaces
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(11);
        treeSet.add(10);
        System.out.println(treeSet);
    }

}

enum Color {
    RED, GREEN, BLUE
}
