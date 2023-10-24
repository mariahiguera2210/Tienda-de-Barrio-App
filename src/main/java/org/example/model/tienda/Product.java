package org.example.model.tienda;

public class Product {

    int id;

    private String name;
    private double price;

    private String description;

    private String category;

    private static int nextId = 1;

    public Product(String name, double price, String description, String category) {
        this.id = nextId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        nextId++;
    }


    public int getId() {
        return id;
    }

    public static int getNextId() {
        return nextId;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }




    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Nombre: " + name + "\n" +
                "Precio: " + price + "\n" +
                "Descripción: " + description + "\n" +
                "Categoría: " + category;
    }
}