package com.punnyajoshi.EcommerceWebAutomation;

import java.util.ArrayList;
import java.util.List;

public class ProductSelector {
    private List<Product> products;

    public ProductSelector() {
        this.products = new ArrayList<>();
        // Hardcoded sample data
        products.add(new Product("Laptop", "High-performance laptop", 999.99));
        products.add(new Product("Smartphone", "Latest smartphone model", 699.99));
        products.add(new Product("Headphones", "Noise-cancelling headphones", 199.99));
    }

    // Selects a product by name
    public Product selectProductByName(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null; // Product not found
    }

    // Selects a product by index
    public Product selectProductByIndex(int index) {
        if (index >= 0 && index < products.size()) {
            return products.get(index);
        }
        return null; // Invalid index
    }
}
