package edu.eci.cvds.Producto.service;

import edu.eci.cvds.Producto.domain.Product;

import java.util.ArrayList;
import java.util.List;

public class ProductServiceProxy implements ProductInterface {
    List<Product> products = new ArrayList<>();

    @Override
    public List<Product> addProduct(Product product){
        if(product.getName() == null ){
            throw new IllegalArgumentException("Producto no encontrado");
        }
        products.add(product);
        return products;
    }
    @Override
    public Product updateProduct(Product product){
        if(product == null || product.getName() == null){
            throw new IllegalArgumentException("Producto invalido");
        }
        for(Product p: products) {
            if (p.getName().equals(product.getName())) {
                p.setPrice(product.getPrice());
                p.setStock(product.getStock());
                p.setType(product.getType());
                System.out.println(product);
                return p;
            }
        }return null;
    }

}
