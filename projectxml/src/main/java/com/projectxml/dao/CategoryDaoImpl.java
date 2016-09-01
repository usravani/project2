package com.projectxml.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectxml.model.Item;
@Repository
public class CategoryDaoImpl implements CategoryDao{
	@Autowired
	SessionFactory sessionFactory;

	public List<Item> getItemByCategory(String category) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction =session.beginTransaction();
		List<Item> list=session.createCriteria(Item.class).add(Restrictions.like("category", category)).list();
		return list;
	}

	
		
	public List<Item> addMens() {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		List<Item>list=session.createCriteria(Item.class).list();
		transaction.commit();
		return list;
	}


	
	}



