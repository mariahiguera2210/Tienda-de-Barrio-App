package org.example.model.tienda;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ProductModifications {
    List<Product> productList;

    public ProductModifications(List<Product> productList){
        this.productList = productList;
    }

    public void updateProduct(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el nombre del producto a actualizar: ");
        System.out.print("Nombre: ");
        String name = scanner.nextLine();

        Product productToUpdate = null;

        // Busca el producto por nombre
        for (Product product : productList) {
            if (product.getName().equalsIgnoreCase(name)) {
                productToUpdate = product;
                break;
            }
        }

        if (productToUpdate == null) {
            System.out.println("Producto no encontrado.");
            return;
        }

        System.out.println("Seleccione qué desea actualizar:");
        System.out.println("1. Nombre");
        System.out.println("2. Descripcion");
        System.out.println("3. Categoría");
        System.out.println("4. Etiqueta");
        System.out.println("5. Precio");
        System.out.println("6. Url");

        int option = scanner.nextInt();
        scanner.nextLine(); // Limpia el búfer del scanner

        switch (option) {
            case 1:
                System.out.print("Nuevo nombre: ");
                String newName = scanner.nextLine();
                productToUpdate.setName(newName);
                break;

            case 2:
                System.out.print("Nueva Descripcion: ");
                String newDescription = scanner.nextLine();
                productToUpdate.setDescription(newDescription);
                break;

            case 3:
                System.out.print("Nueva categoría: ");
                String newCategory = scanner.nextLine();
                productToUpdate.setCategory(newCategory);
                break;
            case 4:
                System.out.print("Nuevo tag: ");
                float newTag = Float.parseFloat(scanner.nextLine());
                productToUpdate.setPrice(newTag);
                break;

            case 5:
                System.out.print("Nuevo precio: ");
                float newPrice = Float.parseFloat(scanner.nextLine());
                productToUpdate.setPrice(newPrice);
                break;

            case 6:
                System.out.print("Nuevo url: ");
                float newUrl = Float.parseFloat(scanner.nextLine());
                productToUpdate.setPrice(newUrl);
                break;
            default:
                System.out.println("Opción no válida.");
        }

        System.out.println("Producto actualizado con éxito.");
    }

}
