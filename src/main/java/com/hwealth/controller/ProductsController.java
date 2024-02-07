package com.hwealth.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hwealth.dao.ProductsDao;
import com.hwealth.exception.ProductsException;
import com.hwealth.model.Products;
import com.hwealth.model.Products;
import com.hwealth.service.ProductsService;


@RestController
@RequestMapping("/products")
@CrossOrigin("http://localhost:4200/")
public class ProductsController {

	@Autowired
	ProductsService service;
	
	@PostMapping("/add")
	public ResponseEntity<Products> addProducts(@RequestBody Products products) {
		try {
		return  new ResponseEntity<Products> (service.addProducts(products),HttpStatus.CREATED);
		}
		catch (ProductsException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@PostMapping("/addall")
	public ResponseEntity<List<Products>> addAllProducts(@RequestBody List<Products> products) {
		try {
		return  new ResponseEntity<List<Products>> (service.addAllProducts(products),HttpStatus.CREATED);
		}
		catch (ProductsException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
		
		
	}
	
	@GetMapping("/all")
	public ResponseEntity<List<Products>> getAllProducts() {
		try {
		return  new ResponseEntity<List<Products>>( service.getAllProducts(),HttpStatus.OK) ;
		}
		catch (ProductsException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}

//	@GetMapping("/search/{id}")
//	public ResponseEntity<Products> searchProducts(@PathVariable("id") long id) {
//		try {
//		return new ResponseEntity<Products> (service.searchProducts(id), HttpStatus.FOUND);
//		}
//		catch (ProductsException e) {
//			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
//		}
//		
//	}
	
//	@PostMapping("/login")
//	public ResponseEntity<Products> ProductsLogin(@RequestBody Products Products) {
//		try {
//			return  new ResponseEntity<Products> (service.login(Products.getProductsName(),Products.getProductsPassword()),HttpStatus.OK);
//			}
//			catch (ProductsException e) {
//				return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
//			}
//		
//	}
//	
//	@DeleteMapping("/remove/{id}")
//	public ResponseEntity<Products> removeProducts(@PathVariable("id") long id) {
//		try {
//			return  new ResponseEntity<Products> (
//		 service.removeProducts(id), HttpStatus.OK);
//		}
//		catch (ProductsException e) {
//			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
//		}
//		
//	}
//
//	@PutMapping("/update")
//	public ResponseEntity<Products> updateProducts(@RequestBody Products Products) {
//		try {
//			return  new ResponseEntity<Products> (
//		service.updateProducts(Products),HttpStatus.CREATED);
//		}
//		catch (ProductsException e) {
//			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
//		}
//		
//	}
	

}
