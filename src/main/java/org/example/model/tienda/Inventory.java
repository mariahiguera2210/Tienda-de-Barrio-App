package org.example.model.tienda;

import org.example.GestorInventario;

import java.util.*;

public class Inventory implements GestorInventario {
    ArrayList<Product> listOfProducts = new ArrayList<Product>();

    Scanner sc = new Scanner(System.in);

        @Override
        public void addProductFromUser () {

            System.out.println("Ingrese nombre ");
            String name = sc.nextLine();

            System.out.println("ingrese la descripcion ");
            String description = sc.nextLine();

            System.out.println("Seleccione una de las siguientes categorias" );
            for (Enums.Categories c: Enums.Categories.values()){
                System.out.println(c);
            }
            String category = sc.nextLine().toUpperCase();

            System.out.println("Seleccione una de las siguientes etiquetas " );
            for (Enums.Etiquetas etiquetas: Enums.Etiquetas.values()){
                System.out.println(etiquetas);
            }
            String tag = sc.nextLine().toUpperCase();

            System.out.println("Ingrese precio ");
            float price = sc.nextFloat();
            sc.nextLine();

            System.out.println("Ingrese url de imagen");
            String imageUrl = sc.nextLine();


            Product nuevoProducto = new Product(name, description, category, tag, price, imageUrl);

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
            System.out.println("Ingresa nombre del producto que quiere eliminar");
            String productName = sc.nextLine();

            boolean removed = false;
            for (Product p: listOfProducts)
                  { if (Objects.equals(p.getName(), productName)){
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
            System.out.println("Ingresa nombre del producto que quiere actualizar");
            String productName = sc.nextLine();
            sc.nextLine();

            Product productToUpdate = null;
            //Busco el producto
            for (Product p: listOfProducts){
                if(Objects.equals(p.getName(), productName)){
                    productToUpdate = p;
                    break;
                }
            }

            if(productToUpdate != null){
                System.out.println("Ingrese nuevo nombre del producto: ");
                String newName = sc.nextLine();
                System.out.println("Ingrese nueva descripcion: ");
                String newDescription = sc.nextLine();
                System.out.println("Ingrese nueva Categoria: ");
                String newCategory = sc.nextLine();
                System.out.println("Ingrese nuevo precio: ");
                float newPrice = sc.nextFloat();
                sc.nextLine();
                System.out.println("Ingrese nueva Etiqueta: ");
                String newTag = sc.nextLine();
                System.out.println("Ingrese nuevo url de imagen");
                String newImageUrl = sc.nextLine();


                productToUpdate.setName(newName);
                productToUpdate.setDescription(newDescription);
                productToUpdate.setCategory(newCategory);
                productToUpdate.setTag(newTag);
                productToUpdate.setPrice(newPrice);
                productToUpdate.setImageUrl(newImageUrl);


                System.out.println("El producrto ha sido actualizado ");
            }

            else {
                System.out.println("Producto no encontrado con el nombre especificado.");
            }
        }


    @Override
    public void findByName(){

        System.out.println("Ingresa el nombre del producto a buscar ");

        try {
            String productName = sc.nextLine();
            sc.nextLine();

        for (Product product: listOfProducts) {
            if (Objects.equals(product.getName(), productName)) {
                System.out.println("El producto que busca es" + product);
            }
            else System.out.println("No hay un producto con ese id ");
        }

        } catch (Exception error){
            System.out.println("valor ingresado no valido");
        }


    }

}


