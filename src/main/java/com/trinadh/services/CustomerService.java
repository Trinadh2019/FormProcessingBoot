package com.trinadh.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trinadh.model.daos.CustomerDao;
import com.trinadh.view.vo.Customer;

@Service
public class CustomerService {//Business class
	
	@Autowired
	private CustomerDao customerDao;
	
	public int processCustomer(Customer customer) {
		return customerDao.save(customer);
	}

}
