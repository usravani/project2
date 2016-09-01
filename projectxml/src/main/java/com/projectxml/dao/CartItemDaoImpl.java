package com.projectxml.dao;



import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectxml.model.CartItem;

@Repository
public class CartItemDaoImpl implements CartItemDao{
@Autowired
SessionFactory Sessionfactory;

	public void addItems(CartItem cartitem) {
		System.out.println("CartItemDaoImpl");
		Session session= Sessionfactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(cartitem);
		transaction.commit();
	}
		
	


}
