package com.projectxml.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectxml.model.Cart;
import com.projectxml.model.Customer;
import com.projectxml.model.UserRole;
@Repository
public class CustomerDaoImpl implements CustomerDao{

	@Autowired
		SessionFactory sessionfactory;
	public Customer initFlow()
	{
		return new Customer();
	}
		public String addCustomer(Customer customer) {
			String status="success";
			if(customer.getUsername().isEmpty())
			{
				return "failure";//if username is empty it retunrs failure
			}
			if(customer.getPassword().isEmpty())
			{
				return "failure";//if password is empty it retunrs failure
			}
			if(customer.getEmailId().isEmpty())
			{
				return "failure";//if emailid is empty it retunrs failure
			}
			System.out.println("CustomerDaoImpl");
			Session session= sessionfactory.getCurrentSession();
			Transaction transaction=session.beginTransaction();
			customer.setEnabled(true);
			session.save(customer);
			UserRole userRole=new UserRole();
			userRole.setAuthority("ROLE_USER");
			System.out.println("cust id:"+customer.getCustomerId());
			userRole.setUserId(customer.getCustomerId());
		    session.save(userRole);
			Cart cart=new Cart();
			cart.setCustomer(customer);
			customer.setCart(cart);//automatically it will assign cart to the customer by this stmt
			transaction.commit();
			return status;
		}
			public List<Customer> viewCustomer(){
			Session session= sessionfactory.getCurrentSession();
			Transaction transaction=session.beginTransaction();
			@SuppressWarnings("unchecked")
			List<Customer>list= session.createCriteria(Customer.class).list();
			return list;
			
		}
			public Customer getCustomerByName(String name) {
				Session session= sessionfactory.getCurrentSession();
				Transaction transaction=session.beginTransaction();
				System.out.println("name = "+name);
				Customer customer = (Customer) session.createCriteria(Customer.class).add(Restrictions.like("username",name)).uniqueResult();
				System.out.println("after getting customer = "+ customer);
				return customer;
			}
		
	}
	


