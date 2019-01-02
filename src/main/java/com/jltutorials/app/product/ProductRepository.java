package com.jltutorials.app.product;

import org.springframework.data.repository.CrudRepository;

public interface ProductRepository extends CrudRepository<Product, Long> {
	
	Product findByName(String name);
}
