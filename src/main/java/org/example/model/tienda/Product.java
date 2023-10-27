package org.example.model.tienda;

import java.util.Date;

public class Product {

    int id;

    private String name;
    private double price;
    private String description;
    private String category;
    private String tag;
    Date dateAdded;
    private static int nextId = 1;

    public Product(String name, double price, String description, String category, String tag, Date dateAdded) {
        this.id = nextId;
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.tag = tag;
        this.dateAdded = dateAdded;
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

    public String getTag(){ return tag; }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(Date dateAdded) {
        this.dateAdded = dateAdded;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
                "Nombre: " + name + "\n" +
                "Precio: " + price + "\n" +
                "Descripción: " + description + "\n" +
                "Categoría: " + category + "\n"+
                "Etiqueta: " + tag + "\n"+
                "Fecha de actualizacion: " + dateAdded;
    }


}