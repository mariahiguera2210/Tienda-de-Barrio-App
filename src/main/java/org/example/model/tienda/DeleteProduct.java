package org.example.model.tienda;

import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class DeleteProduct {

    private List<Product> productList;

    public DeleteProduct(List<Product> productList){

        this.productList = productList;

    }


    public void removeProduct () {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingresa nombre del producto que quiere eliminar");
        String productName = sc.nextLine();

        Iterator<Product> iterator = productList.iterator();
        boolean removed = false;

        while (iterator.hasNext()) {
            Product product = iterator.next();
            if (Objects.equals(product.getName(), productName)) {
                iterator.remove();
                System.out.println("El producto ha sido eliminado");
                removed = true;
                break;
            }
        }

        if (!removed) {
            System.out.println("Producto no encontrado");
        }
    }
}
