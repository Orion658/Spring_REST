package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.customException.DuplicateProductExeception;
import com.app.entity.Product;
import com.app.service.ProductService;

@RestController
@RequestMapping("/products")
public class ProductController {

	// http://localhost:8080/swagger-ui/index.html#/

	@Autowired
	private ProductService productService;

	@PostMapping
	public ResponseEntity<Product> createProduct(@Validated @RequestBody Product product)
			throws DuplicateProductExeception {
		Product createdProduct = productService.createProduct(product);
		return new ResponseEntity<>(createdProduct, HttpStatus.CREATED);
	}

	@GetMapping
	public ResponseEntity<List<Product>> getAllProducts() {
		List<Product> products = productService.getAllProducts();
		return new ResponseEntity<>(products, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Long id) {
		Product product = productService.getProductById(id);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

	@GetMapping("/byCode/{productCode}")
	public ResponseEntity<Product> getProductByProductCode(@PathVariable String productCode) {
		Product product = productService.getProductByProductCode(productCode);
		return new ResponseEntity<>(product, HttpStatus.OK);
	}

//	@PutMapping
//	@DeleteMapping
}
