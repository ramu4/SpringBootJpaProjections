package com.app.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.app.repo.ProductRepository;
import com.app.repo.ProductRepository.MyData;
@Component
public class ConsoleRunner implements CommandLineRunner {

	@Autowired
	private ProductRepository repo;

	@Override
	public void run(String... args) throws Exception {

	//1.Static Projection
	//repo.findByProdCost(3.3).forEach(p->System.out.println(p.getProdCode()+","+p.getProdModel()));
	//repo.findByProdCode("B").forEach(p->System.out.println(p.getProdCost()+","+p.getProdVendor()));

	repo.findByProdCost(5.5, MyData.class).forEach(p->System.out.println(p.getProdCode()));
	
	
	}

}
