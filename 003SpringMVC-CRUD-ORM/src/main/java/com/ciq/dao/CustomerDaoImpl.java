package com.ciq.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.ciq.model.Customer;

@Repository
@Transactional
public class CustomerDaoImpl implements CustomerDao  {
	
	@Autowired
	private HibernateTemplate hibernateTemplate;
	

	@Override
	public void add(Customer customer) {
		hibernateTemplate.save(customer);
		
	}


	@Override
	public List<Customer> findAll() {
	
		return hibernateTemplate.loadAll(Customer.class)  ;
	}


	@Override
	public void deleteById(Integer cid) {
		hibernateTemplate.delete(new Customer(cid,"","",0.0 ));
		
	}


	@Override
	public Customer findById(Integer cid) {
		
		return hibernateTemplate.get(Customer.class, cid);
	}


	@Override
	public void update(Customer customer) {
		hibernateTemplate.saveOrUpdate(customer);
		
	}

}
