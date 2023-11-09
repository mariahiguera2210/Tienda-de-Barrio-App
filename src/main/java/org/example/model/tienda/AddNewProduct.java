package org.example.model.tienda;

import org.example.CSVProductLoader;

import java.util.List;
import java.util.Scanner;

public class AddNewProduct {

    private List<Product> productList;


    public AddNewProduct(List<Product> productList) {
        this.productList = productList;
    }

    public void addProductFromConsole() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los datos del nuevo producto:");

        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        System.out.print("Descripción: ");
        String description = scanner.nextLine();

        System.out.print("Categoría: ");
        String category = scanner.nextLine();

        System.out.print("Etiquetas: ");
        String tags = scanner.nextLine();

        System.out.print("Precio: ");
        float price = Float.parseFloat(scanner.nextLine());

        System.out.print("URL de la imagen: ");
        String imageUrl = scanner.nextLine();

        // Crear un nuevo objeto Product con los datos ingresados
        Product product = new Product(name, description, category, tags, price, imageUrl);

        // Agregar el producto a la lista productList
        productList.add(product);
    }

    public void showProducts(){
        for(Product product: productList){
            System.out.println(product);
        }
    }

    public List<Product> getProductList() {
        return productList;
    }
}

