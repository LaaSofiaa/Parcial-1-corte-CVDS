package edu.eci.cvds.Producto;

import edu.eci.cvds.Producto.domain.Product;
import edu.eci.cvds.Producto.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ProductoApplicationTests {
	private ProductService productService;
	@Test
	public void shouldAddLproduct(){
		Product product = new Product("xbox", 100000, 5, "gaming");
		List<Product> products = productService.addProduct(product);
		assertEquals("xbox",product.getName());
	}
	@Test
	public void shouldNotAddProduct(){
		Product product = new Product("pc", null, 5, "gaming");
		List<Product> products = productService.addProduct(product);
		assertNotNull(product.getPrice());
	}

	


}
