package edu.eci.cvds.Producto.service;

import edu.eci.cvds.Producto.domain.Product;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements ProductInterface {
    List<Product> products = new ArrayList<>();
    @Override
    public List<Product> addProduct(Product product){
        products.add(product);
    }





}
