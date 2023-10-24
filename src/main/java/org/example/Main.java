package org.example;

import org.example.model.tienda.Inventory;
import org.example.model.tienda.Usuario;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Inventory inventory = new Inventory();
        Usuario usuario= new Usuario("admin123", "1234");
        System.out.println("Ingresa tu usario: ");
        String inputUsuario = scanner.nextLine();
        System.out.println("Ingresa contraseña: ");
        String inputPasword= scanner.nextLine();


        if(inputUsuario.equals(usuario.getUsuarioId()) && inputPasword.equals(usuario.getUsuarioPasword())){
            boolean exit = false;
            while (!exit) {
                System.out.println("±----------------------------------------±");
                System.out.println("|   Administrador Mi Tienda de Barrio    |");
                System.out.println("±----------------------------------------±");
                System.out.println("1. Agregar producto                      |");
                System.out.println("2. Eliminar producto                     |");
                System.out.println("3. Actualizar producto                   |");
                System.out.println("4. Ver todos los productos               |");
                System.out.println("5. Salir                                  |");
                System.out.println("±----------------------------------------±");
                System.out.print("   Ingresa tu opción (1 - 5): \n");

                int choice = scanner.nextInt();
                scanner.nextLine();

                switch (choice) {
                    case 1 -> inventory.addProductFromUser();
                    case 2 -> inventory.removeProduct();
                    case 3 -> inventory.updateProduct();
                    case 4 -> inventory.allProducts();
                    case 5 -> {
                        System.out.println("Saliendo...");
                        exit = true;
                    }
                    default -> System.out.println("Opción inválida. Por favor, intenta de nuevo.");
                }
            }
        }
        else {
            System.out.println("el usuario o contraseña no coinciden");
        }

    }
}


