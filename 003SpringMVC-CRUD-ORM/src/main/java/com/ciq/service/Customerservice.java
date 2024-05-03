package com.ciq.service;

import java.util.List;

import com.ciq.model.Customer;

public interface Customerservice {
	
	public void add(Customer customer);
    
	public List<Customer> findAll();
	
	public void deleteById(Integer cid);

	public Customer findById(Integer cid);

	public void update(Customer customer);
	
}
