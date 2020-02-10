package com.matricon.productstore;

import java.text.SimpleDateFormat;
import java.time.Year;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        Product p1 = new Product("Chesse", 29.50, 38.50, "01-12-2020", "Milk", 15);
        Product p2 = new Product("Chefir", 3.50, 5.50, "15-02-2020", "Milk", 25);
        Product p3 = new Product("Jana", 6.25, 10.00, "06.06.2020", "Water", 30);
        Product p4 = new Product("Pepsi", 11.30, 18.0, "10.10.2020", "Water", 24);
        Product p5 = new Product("Riga", 4.5, 7.8, "15.02.2020", "Bread", 22);
        Product p6 = new Product("Tallin", 5.30, 8.50, "16.02.2020", "Bread", 21);
        Product p7 = new Product("Bounty", 5.20, 10.50, "10.09.2020", "Candies", 14);
        Product p8 = new Product("Lion", 5.30, 10.70, "15.08.2020", "Candies", 15);
        Product p9 = new Product("Orange", 18.3, 25.50, "01.04.2020", "Fruits", 17);
        Product p10 = new Product("Banana", 8.5, 17.0, "01.03.2020", "Fruits", 18);

        List<Product> productList = new ArrayList<>();
        productList.add(p1);
        productList.add(p2);
        productList.add(p3);
        productList.add(p4);
        productList.add(p5);
        productList.add(p6);
        productList.add(p7);
        productList.add(p8);
        productList.add(p9);
        productList.add(p10);

        System.out.println("List of products");
        for(Product pr : productList)
            System.out.println(pr);

        System.out.println("");
        System.out.println("Products sorted by names: ");
        class ProductComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2){
                return p1.getName().compareTo(p2.getName());
            }
        }

        List product1 = productList.stream()
                .sorted(new ProductComparator())
                .collect(Collectors.toList());
        product1.forEach((x) -> System.out.println(x));


        System.out.println("");
        System.out.println("Products sorted by ExpiryDate: ");
        class DateComparator implements Comparator<Product> {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getExpirydate().compareTo(p2.getExpirydate());
            }
        }
        

        List product2 = productList.stream()
                .sorted(new DateComparator())
                .collect(Collectors.toList());
        product2.forEach((p)->System.out.println(p));
    }
}
