package com.hwealth.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hwealth.exception.OrderException;
import com.hwealth.exception.ProductsException;
import com.hwealth.exception.OrderException;
import com.hwealth.model.Orders;
import com.hwealth.model.Orders;
import com.hwealth.service.OrderService;

@RestController
@RequestMapping("/order")
@CrossOrigin("http://localhost:3000/")
public class OrderController {
  @Autowired
  OrderService service;
  
  @PostMapping("/add")
  public ResponseEntity<Orders> addOrder(@RequestBody Orders order)
  {
	  try {
		  return new ResponseEntity<Orders>(service.addOrder(order),HttpStatus.CREATED);
	  }
	  catch(OrderException e)
	  {
		  return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
	  } 
  }
  
  @GetMapping("/all")
	public ResponseEntity<List<Orders>> getAllOrders() {
		try {
		return  new ResponseEntity<List<Orders>>( service.getAllinsurance(),HttpStatus.OK) ;
		}
		catch (OrderException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
	@GetMapping("/user/{userId}")
	public ResponseEntity<List<Orders>> getUserOrders(@PathVariable("userId") long userId) {
		try {
				
		return  new ResponseEntity<List<Orders>>(service.getAllinsurance().stream().filter(a->a.getUser().getUserId()==userId).toList(),HttpStatus.OK) ;
		}
		catch (OrderException e) {
			return new ResponseEntity(e.getMessage(),HttpStatus.NOT_FOUND);
		}
	}
  
}
