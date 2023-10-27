package org.example.model.tienda;

import org.example.GestorInventario;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Inventory implements GestorInventario {
    ArrayList<Product> listOfProducts = new ArrayList<Product>();

    Scanner sc = new Scanner(System.in);

        @Override
        public void addProductFromUser () {

            System.out.println("Ingrese nombre ");
            String name = sc.nextLine();

            System.out.println("Ingrese precio ");
            double price = sc.nextDouble();
            sc.nextLine();

            System.out.println("ingrese la descripcion ");
            String description = sc.nextLine();

            System.out.println("Ingrese una de las siguientes categorias" );
            for (Enums.Categories c: Enums.Categories.values()){
                System.out.println(c);
            }
            String category = sc.nextLine().toUpperCase();

            System.out.println("Ingrese una de las siguientes etiquetas " );
            for (Enums.Etiquetas etiquetas: Enums.Etiquetas.values()){
                System.out.println(etiquetas);
            }
            String tag = sc.nextLine().toUpperCase();

            Date dateAdded = Calendar.getInstance().getTime();

            Product nuevoProducto = new Product(name, price, description, category, tag, dateAdded);

            addProduct(nuevoProducto);

        }


        private void addProduct (Product product){

            if (!listOfProducts.contains(product)) {
                listOfProducts.add(product);
            }

            System.out.println("Producto agregado al inventario.");

        }

        public void allProducts () {
            System.out.println("Lista de productos ");
            for (Product p : listOfProducts) {
                System.out.println(p);
            }
        }

        @Override
        public void removeProduct () {
            System.out.println("Ingresa ID del producto que quiere eliminar");
            int productId = sc.nextInt();

            boolean removed = false;
            for (Product p: listOfProducts)
                  { if (p.getId() == productId){
                      listOfProducts.remove(p);
                      System.out.println("El producto ha sido eliminado");
                      removed = true;
                      break;
                  }
            }
            if(!removed){
                System.out.println("Producto no encontrado");
            }
        }

        @Override
        public void updateProduct () {
            System.out.println("Ingresa ID del producto que quiere actualizar");
            int productId = sc.nextInt();
            sc.nextLine();

            Product productToUpdate = null;
            //Busco el producto
            for (Product p: listOfProducts){
                if(p.getId() == productId){
                    productToUpdate = p;
                    break;
                }
            }

            if(productToUpdate != null){
                System.out.println("Ingrese nuevo nombre del producto: ");
                String newName = sc.nextLine();
                System.out.println("Ingrese nuevo precio: ");
                double newPrice = sc.nextDouble();
                sc.nextLine();
                System.out.println("Ingrese nueva descripcion: ");
                String newDescription = sc.nextLine();
                System.out.println("Ingrese nueva Categoria: ");
                String newCategory = sc.nextLine();
                System.out.println("Ingrese nueva Etiqueta: ");
                String newTag = sc.nextLine();

                Date dateUpdated = Calendar.getInstance().getTime();

                productToUpdate.setName(newName);
                productToUpdate.setPrice(newPrice);
                productToUpdate.setDescription(newDescription);
                productToUpdate.setCategory(newCategory);
                productToUpdate.setTag(newTag);
                productToUpdate.setDateAdded(dateUpdated);

                System.out.println("El producrto ha sido actualizado ");
            }

            else {
                System.out.println("Producto no encontrado con el ID especificado.");
            }
        }
}


