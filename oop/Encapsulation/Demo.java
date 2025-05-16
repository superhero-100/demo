/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


/**
 *
 * @author tagline
 */
public class Demo {

    public static void main(String[] args) {
        Product product = new Product();
        product.setId(5);
        product.setName("mobile");
        System.err.println("Id: " + product.getId());
        System.err.println("Name: " + product.getName());
    }

}

class Product {

    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
