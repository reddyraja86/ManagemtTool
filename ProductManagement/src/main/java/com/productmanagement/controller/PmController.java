package com.productmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.productmanagement.model.Product;
import com.productmanagement.respository.ProductI;

@RestController
@RequestMapping("/product")
public class PmController {

	@Autowired
	ProductI productService;

	@PostMapping("/create")
	public void createProduct(@RequestBody Product product) {
		System.out.println("--This is Product API ---"+product.getProductName());
		productService.save(product);
	}
}
