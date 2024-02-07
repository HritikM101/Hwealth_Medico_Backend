package com.hwealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hwealth.model.Products;


@Repository
public interface ProductsDao extends JpaRepository<Products,Long> {
	
}



