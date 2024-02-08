package com.hwealth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwealth.dao.OrderDao;
import com.hwealth.model.Orders;

@Service
public class OrderService {
  @Autowired
	private OrderDao dao;
	
	public Orders addOrder(Orders o)
	{
		return dao.save(o);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
