package com.hwealth.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hwealth.model.Orders;
@Repository
public interface OrderDao extends JpaRepository<Orders, Long> {

}
