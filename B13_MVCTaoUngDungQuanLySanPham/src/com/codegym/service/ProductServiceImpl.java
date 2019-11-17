package com.codegym.service;

import com.codegym.model.Product;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ProductServiceImpl implements ProductService {
    private static Map<Integer, Product> productMap;

    static {
        productMap = new HashMap<>();
        productMap.put(1, new Product(1, "Iphone8", "dep", "Apple"));
        productMap.put(2, new Product(2, "Note8", "xin", "Samsung"));
        productMap.put(3, new Product(3, "IphoneX", "lung linh", "Apple"));
        productMap.put(4, new Product(4, "Nokia7.2", "co dien", "Nokia"));
    }

    @Override
    public List<Product> fillAll() {
        return new ArrayList<>(productMap.values());
    }

    @Override
    public void save(Product product) {
        productMap.put(product.getIdProduct(), product);
    }

    @Override
    public Product findById(int idProduct) {
        return productMap.get(idProduct);
    }

    @Override
    public void update(int idProduct, Product product) {
        productMap.put(idProduct, product);
    }

    @Override
    public void remove(int idProduct) {
        productMap.remove(idProduct);
    }

    @Override
    public List<Product> findByName(String name) {
        List<Product> products = new ArrayList<Product>();
        for (Product product : fillAll()
        ) {
            if (product.getNameProduct().equals(name)) {
                products.add(product);
            }
        }
        return products;
    }
}
