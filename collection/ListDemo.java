
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author tagline
 */
public class ListDemo {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        System.out.println(list);
        list.remove(0);

        //normal list fetures
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        System.out.println(arrayList);
        arrayList.remove(0);

        //extends deueue
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        System.out.println(linkedList);
        linkedList.remove(0);

        // threadsafe lagacy        lagacy menthods   addElement    etc..
        Vector<Integer> vector = new Vector<>();
        vector.add(10);
        System.out.println(vector);
        vector.remove(0);

        // threadsafe lagacy    extends vector
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        System.out.println(stack);
        stack.pop();
    }

}
