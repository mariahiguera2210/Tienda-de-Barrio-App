package org.example.model;

public class Product {
    private String name;
    private double price;
    private int stock;


    public Product(String name, double price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;

    }

    public String getName() {
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

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    //    Determinar si tu producto se quedo sin inventario.
    public boolean outOfStock(){
        return stock == 0;
    }
    //    Determinar si el precio de un producto es mayor a un valor pasado por parametro.
    public boolean biggerPrice( double valor ){
        return price > valor;
    }

    //    Determinar si el nombre del producto contiene una palabra pasada por parametro.
    public boolean containWord( String word ){
        return name.contains(word);
    }

    @Override
    public String toString() {
        return "{ 'name':" + name + ", price:" + price + ", stock:" + stock + "}";
    }
}
