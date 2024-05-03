package com.ciq.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ciq.dao.CustomerDao;
import com.ciq.model.Customer;

@Service
public class CustomerserviceImpl implements  Customerservice {

	@Autowired
	private CustomerDao customerDao;
	
	
	@Override
	public void add(Customer customer) {
		customerDao.add(customer);
		
	}


	@Override
	public List<Customer> findAll() {
		
		return customerDao.findAll();
	}


	@Override
	public void deleteById(Integer cid) {
		customerDao.deleteById(cid);
		
	}


	@Override
	public Customer findById(Integer cid) {
		return customerDao.findById(cid);
	}


	@Override
	public void update(Customer customer) {
		customerDao.update(customer);
		
	}

}
