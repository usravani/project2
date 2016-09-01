package com.projectxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectxml.dao.CustomerDao;
import com.projectxml.model.Customer;
@Service
public class CustomerServiceImpl implements CustomerService{
 @Autowired
	CustomerDao customerDao;
	public void addCustomer(Customer customer) {
		System.out.println("customer service");
		customerDao.addCustomer(customer);
		
	}
	public List<Customer>viewCustomer()
	{
		List<Customer>list=customerDao.viewCustomer();
		return list;
	}
	public Customer getCustomerByName(String name) {
		return customerDao.getCustomerByName(name);
	}
}
