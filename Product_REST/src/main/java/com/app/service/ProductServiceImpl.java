package com.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.customException.DuplicateProductExeception;
import com.app.dao.ProductRepository;
import com.app.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product createProduct(Product product) throws DuplicateProductExeception {
		// Check if the product with the same code already exists
		Optional<Product> existingProduct = productRepository.findByProductCode(product.getProductCode());
		if (existingProduct.isPresent()) {
			// Handle the case where the product with the same code already exists
			throw new DuplicateProductExeception("Product with the given code already exists");
		}

		// Save the new product
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
	}

	@Override
	public Product getProductByProductCode(String productCode) {
		return productRepository.findByProductCode(productCode)
				.orElseThrow(() -> new RuntimeException("Product not found with code: " + productCode));
	}
}
