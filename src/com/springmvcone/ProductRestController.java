package com.springmvcone;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {

	private List<Product> products = new ArrayList<>();

	public ProductRestController() {
		products.add(new Product("1", "Pen", 100));
		products.add(new Product("2", "Marker", 200));

	}

//	@RequestMapping(path = "/products", method = RequestMethod.GET)
	@GetMapping("/products")
	public List<Product> getProducts() {
		return products;
	}

	@PostMapping("/products")
	public void add(@RequestBody Product p) {
		products.add(p);
	}

	@DeleteMapping("/products/{code}")
	public boolean delete(@PathVariable("code") String code) {
		boolean flag = false;
		for (Iterator<Product> iterator = products.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			if (product.getCode().equals(code)) {
				iterator.remove();
				flag = true;
			}
		}
		return flag;
	}

	@PutMapping("/products/{code}")
	public void update(@PathVariable("code") String code, @RequestBody Product p) {
		if(delete(code))
			add(p);
	}
}
