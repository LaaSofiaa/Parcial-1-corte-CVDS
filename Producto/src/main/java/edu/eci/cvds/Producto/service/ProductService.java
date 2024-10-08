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
        return products;
    }
    @Override
    public Product updateProduct(Product product){
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
