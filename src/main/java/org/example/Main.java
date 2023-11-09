package org.example;
import org.example.exceptions.InvalidMenuOptions;
import org.example.model.tienda.*;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception{
        Scanner scanner = new Scanner(System.in);
        CSVProductLoader csvProductLoader = new CSVProductLoader();
        csvProductLoader.loadProductsFromCSV("src/main/java/org/example/resources/inventoryData.csv");
        List<Product> productList = csvProductLoader.getProductList();
        AddNewProduct addNewProduct = new AddNewProduct(productList);
        DeleteProduct deleteProduct = new DeleteProduct(productList);
        ProductModifications productModifications = new ProductModifications(productList);

        Inventory inventory = new Inventory();
        User user = new User("admin123", "1234");
        System.out.println("Ingresa tu nombre de usario: ");
        String inputUsuario = scanner.nextLine();
        System.out.println("Ingresa contraseña: ");
        String inputPasword= scanner.nextLine();


        if(inputUsuario.equals(user.getUserId()) && inputPasword.equals(user.getUserPassword())){


            boolean exit = false;
            while (!exit) {
                System.out.println("±----------------------------------------±");
                System.out.println("|   Administrador Mi Tienda de Barrio    |");
                System.out.println("±----------------------------------------±");
                System.out.println("1. Agregar producto                      |");
                System.out.println("2. Eliminar producto                     |");
                System.out.println("3. Actualizar producto                   |");
                System.out.println("4. Ver lista de productos                |");
                System.out.println("5. Buscar producto por nombre             |");
                System.out.println("6. Salir                                 |");
                System.out.println("±----------------------------------------±");
                System.out.print("   Ingresa tu opción (1 - 6): \n");

                try {
                int choice = scanner.nextInt();
                scanner.nextLine();
                switch (choice) {
                    case 1 -> addNewProduct.addProductFromConsole();
                    case 2 -> deleteProduct.removeProduct();
                    case 3 -> productModifications.updateProduct();
                    case 4 -> addNewProduct.showProducts();
                    case 5 -> inventory.findByName();
                    case 6 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    default -> System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                }
            } catch (Exception error) {
                    throw new InvalidMenuOptions("Ingresa una opcion valida");
                    }
            }
        }
        else {
            System.out.println("el usuario o contraseña no coinciden");
        }

    }
}


