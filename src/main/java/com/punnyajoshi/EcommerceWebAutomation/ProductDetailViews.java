package com.punnyajoshi.EcommerceWebAutomation;

public class ProductDetailViews {
    // Displays product details
    public void displayProductDetails(Product product) {
        if (product != null) {
            System.out.println("Product Name: " + product.getName());
            System.out.println("Description: " + product.getDescription());
            System.out.println("Price: $" + product.getPrice());
        } else {
            System.out.println("Product not found.");
        }
    }

}