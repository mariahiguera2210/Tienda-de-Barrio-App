package org.example;

import org.example.model.tienda.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class CSVProductLoader {

    private static final String CSV_FILE = "resources/inventoryData.csv";
    public static List<Product> loadProductsFromCSV() {
        List<Product> productList = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(CSV_FILE))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] productInfo = line.split(",");
                if (productInfo.length == 6) {
                    String name = productInfo[0];
                    String description = productInfo[1];
                    String category = productInfo[2];
                    String tags = productInfo[3];
                    float price = productInfo[4].isEmpty() ? (float) 0.0 :Float.parseFloat(productInfo[4]);
                    String imageUrl = productInfo[5];
                    Product product = new Product(name, description, category, tags, price, imageUrl);
                    System.out.println(product);
                    productList.add(product);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return productList;
    }

}
