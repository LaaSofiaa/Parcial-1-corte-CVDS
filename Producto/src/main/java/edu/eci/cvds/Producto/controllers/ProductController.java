package edu.eci.cvds.Producto.controllers;

import edu.eci.cvds.Producto.domain.Product;
import edu.eci.cvds.Producto.service.ProductInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
@RestController
public class ProductController {
    @Autowired
    private ProductInterface productInterface;

    @PostMapping("/product")
    public ResponseEntity<Product> postProduct(@RequestBody Product product){
        productInterface.addProduct(product);
        return  ResponseEntity.ok(product);}

    @PatchMapping ("/product/{product}")
    public ResponseEntity<Product> updateProduct(@PathVariable Product product){
        productInterface.updateProduct(product);
        return  ResponseEntity.ok(product);}

}
