package com.hwealth.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwealth.dao.ProductsDao;
import com.hwealth.exception.ProductsException;
import com.hwealth.exception.UserException;
import com.hwealth.model.Products;
import com.hwealth.model.User;

@Service
public class ProductsService {

	@Autowired
	ProductsDao dao;
	
	public Products addProducts(Products p) {
		return dao.save(p);
	}
	
	public List<Products> addAllProducts(List<Products> p) {
		return dao.saveAll(p);
	}
	
//	public User updateProducts(User c) {
//		Optional<User> findById = dao.findById(c.getUserId());
//		if (!findById.isPresent())
//			throw new UserException("User not present");
//		else
//			return dao.save(c);
//	}
//
//	public User removeUser(long id) {
//		Optional<User> findById = dao.findById(id);
//		if (findById.isPresent()) {
//			User User = findById.get();
//			dao.delete(User);
//			return User;
//		} else
//			throw new UserException("User not present");
//
//	}
//
//	public User searchUser(long id) {
//		Optional<User> findById = dao.findById(id);
//		if (findById.isPresent())
//			return findById.get();
//		else
//			throw new UserException("User not present");
//	}
//	
//	public User login(String userName,String userPassword) {
//		Optional<User> findByName = dao.LoginUser(userPassword, userName);
//		if (findByName.isPresent())
//			return findByName.get();
//		else
//			throw new UserException("User not present");
//	}
//	

	public List<Products> getAllProducts() {
		if (dao.findAll().size() == 0)
			throw new ProductsException("Product list is empty");
		else
			return dao.findAll();
	}
}
