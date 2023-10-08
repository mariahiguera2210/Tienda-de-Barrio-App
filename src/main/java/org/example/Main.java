package org.example;
import org.example.model.Product;
public class Main {
    public static void main(String[] args) {
        Product producto = new Product("Arroz ", 19.99, 100);

        System.out.println("Nombre del producto: " + producto.getName());
        System.out.println("Precio del producto: $" + producto.getPrice());
        System.out.println("Existencias del producto: " + producto.getStock());
        if(producto.outOfStock()){
            System.out.println("El producto " + producto.getName() + "esta agotado");
        } else {
            System.out.println("El producto " + producto.getName() + "esta disponible");
        }

        double valorFijo = 19.99;
        if (producto.biggerPrice(valorFijo)) {
            System.out.println("El precio del producto " + producto.getName() + " es mayor al valor fijo : $" + valorFijo);
        }
        else{
            System.out.println("El precio del product " + producto.getName()+ "es menor o igual al valor fijo: $ " + valorFijo);
        }
        String palabra = "rroz";
        if(producto.containWord(palabra)){
            System.out.println("El nombre del producto contiente la palabra " + palabra);
        }else {
            System.out.println("El nombre del producto no contiene la palbara " + palabra);
        }
    }
}
