package com.app.service;

import java.util.List;

import com.app.customException.DuplicateProductExeception;
import com.app.entity.Product;

public interface ProductService {
	Product createProduct(Product product) throws DuplicateProductExeception;

	List<Product> getAllProducts();

	Product getProductById(Long id);

	Product getProductByProductCode(String productCode);
}
