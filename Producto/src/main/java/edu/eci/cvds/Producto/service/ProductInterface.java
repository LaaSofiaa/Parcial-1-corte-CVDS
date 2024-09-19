package edu.eci.cvds.Producto.service;

import edu.eci.cvds.Producto.domain.Product;

import java.util.List;

public interface ProductInterface {

    List<Product> addProduct(Product product);
    Product updateProduct(Product product);
}
