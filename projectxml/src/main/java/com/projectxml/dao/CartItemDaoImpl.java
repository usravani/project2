package com.projectxml.dao;



import java.util.List;

import org.hibernate.Query;
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

	@Override
	public List<CartItem> ViewCartProducts(int cartId) {
		Session session= Sessionfactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Query query=session.createQuery("from CartItem where cartId="+cartId);
		List<CartItem>list=query.list();
		return list;
	}

	@Override
	public void deleteItem(CartItem cartitem) {
		Session session=Sessionfactory.getCurrentSession();
		Transaction transaction =session.beginTransaction();
		session.delete(cartitem);
		transaction.commit();
		
	}



	
		
	}
		
	



