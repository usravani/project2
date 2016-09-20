package com.projectxml.dao;

import java.util.List;

import com.projectxml.model.Customer;

public interface CustomerDao {
	
		public String addCustomer(Customer customer);
		
		public List<Customer>viewCustomer();
		Customer getCustomerByName(String name);
}



