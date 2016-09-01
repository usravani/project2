package com.projectxml.service;

import java.util.List;

import com.projectxml.model.Customer;

public interface CustomerService {
	public void addCustomer(Customer customer);

	
	public List<Customer>viewCustomer();
	Customer getCustomerByName(String name);
	}


