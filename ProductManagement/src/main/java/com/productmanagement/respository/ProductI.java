package com.productmanagement.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Service;

import com.productmanagement.model.Product;

@Service
public interface ProductI extends MongoRepository<Product, Long> {

}
