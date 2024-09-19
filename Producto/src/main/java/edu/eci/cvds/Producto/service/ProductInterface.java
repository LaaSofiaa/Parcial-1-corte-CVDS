package edu.eci.cvds.Producto.service;

import edu.eci.cvds.Producto.domain.Product;

import java.util.List;

public abstract class ProductInterface {

    public abstract List<Product> addProduct(Product product);

    public abstract Product updateProduct(Product product);
}
