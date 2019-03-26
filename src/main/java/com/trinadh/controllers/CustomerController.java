package com.trinadh.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.trinadh.services.CustomerService;
import com.trinadh.view.vo.Customer;

@Controller
@RequestMapping("/customers")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@RequestMapping(value="/registration/form", method=RequestMethod.GET)
	public String getNewCustomerRegistrationForm(Map<String, Object> map) {
		
		map.put("customer", new Customer());
		
		return "NewCustomer";
		
	}
	
	@RequestMapping(value="/create", method=RequestMethod.POST)
	public String insertCustomer(Customer customer, Errors errors) {
		
		if(errors.hasErrors()) {
			return "NewCustomer";//Re-directed back to request page
			
		}
		
		Integer cid = customerService.processCustomer(customer);
		customer.setCid(cid);
		
		return "success";
		
	}

}
