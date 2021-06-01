package com.groceryshop.base.service;

import java.util.List;
import com.groceryshop.base.model.Product;

public interface ProductService {

public Product save(Product product);
	
List<Product> getAll();

}
