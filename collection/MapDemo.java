
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.TreeMap;
import java.util.WeakHashMap;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class MapDemo {

    public static void main(String[] args) {

        Map<Integer, String> map = new HashMap<>();
        map.put(11, "world");
        map.put(10, "hello");
        System.out.println(map);

        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(11, "world");
        hashMap.put(10, "hello");
        System.out.println(hashMap);

        // maintains inserton order and provides some functions
        LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(11, "world");
        linkedHashMap.put(10, "hello");
        System.out.println(linkedHashMap);

        // removes the entry if the key is not references to elsewhere
        WeakHashMap<Object, String> weakHashMap = new WeakHashMap<>();
        Object object = new Object();
        weakHashMap.put(object, "world");
        object = null;
        System.gc();
        System.out.println(weakHashMap);

        // uses == not .equals for key comparision
        IdentityHashMap<String, Integer> identityHashMap = new IdentityHashMap<>();
        identityHashMap.put("hello", 10);
        identityHashMap.put("hello", 20);
        System.out.println(identityHashMap);

        // naural sorting order or custom comparator
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("world", 11);
        treeMap.put("hello", 10);
        System.out.println(treeMap);

        // threadsafe lagacy supports lagacy methods
        Hashtable<Integer, String> hashtable = new Hashtable<>();
        hashtable.put(10, "hello");
        System.out.println(hashtable);

        // extends hashtable
        Properties props = new Properties();
        props.setProperty("key", "hello");
        props.setProperty("key", "value");
        System.out.println(props);

    }

}
