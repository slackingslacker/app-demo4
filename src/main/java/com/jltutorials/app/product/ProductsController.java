package com.jltutorials.app.product;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ProductsController {

    @Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/products", method = RequestMethod.GET)
	public String listProducts(Model model) throws Exception {
		model.addAttribute("allProducts", productRepository.findAll());
		return "products";
	}

	@RequestMapping(value = "/product", method = RequestMethod.GET)
	public String getProductDetail(Model model, @RequestParam(value = "name", defaultValue = "") String name)
			throws Exception {
		model.addAttribute("product", productRepository.findByName(name));
		return "product";
	}
}
