package com.hwealth.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hwealth.dao.OrderDao;
import com.hwealth.exception.OrderException;
import com.hwealth.model.Orders;
import com.hwealth.model.Orders;

@Service
public class OrderService {
  @Autowired
	private OrderDao dao;
	
	public Orders addOrder(Orders o)
	{
		return dao.save(o);
	}
	
	public List<Orders> getAllinsurance() {
		if (dao.findAll().size() == 0)
			throw new OrderException("Orders Insurance list is empty");
		else
			return dao.findAll();
	}

	
}
