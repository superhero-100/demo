
import java.util.List;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author tagline
 */
public class forEachLoop {

    public static void main(String[] args) {

        //loop aray or any collection 
        // foreach loop
        List<String> list = List.of("java", "python", "c", "kotlin", "javascript");
        for (String lang : list) {
            System.err.println("Language:" + lang);
        }

    }
}
