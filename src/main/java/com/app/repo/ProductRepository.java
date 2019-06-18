package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {
	
	//1.Static Projection
	/*interface ViewA{
		String getProdCode();
		String getProdModel();
		
	}
	
	interface ViewB{
		String getProdVendor();
		String getProdCost();
		
	}
	
	//List<ViewA> findByProdCost(Double prodCost);
	//List<ViewB> findByProdCode(String prodCode);
	*/
	
	//2.Dynamic Projection
	interface MyData{
		String getProdCode();
		Integer getProdId();
	}
	
	interface Myview{
		String getProdCode();
		Double getProdCost();
		
	}
	
	
	<T> List<T> findByProdCost(Double prodCost,Class<T> cls);
	
	
	
}
