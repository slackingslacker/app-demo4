package com.jltutorials.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jltutorials.app.product.Product;
import com.jltutorials.app.product.ProductRepository;

@SpringBootApplication
public class App implements ApplicationRunner
{
    @Autowired
	private ProductRepository productRepository;
    
    public static void main(String[] args) throws Exception {
		SpringApplication.run(App.class, args);
	}
    
    public void run(ApplicationArguments arg0) throws Exception {
		productRepository.save(new Product("Apple", 1f, "An apple is a sweet, edible fruit produced by an apple tree."));
        productRepository.save(new Product("Orange", 0.35f, "The orange is the fruit of the citrus species Citrus in the family Rutaceae."));
        productRepository.save(new Product("Banana", 1.3f, "A banana is an edible fruit produced by several kinds of large herbaceous flowering plants in the genus Musa."));
	}
}
