package com.projectxml.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.type.NTextType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.projectxml.model.Item;
@Repository
public class ItemDaoImpl implements ItemDao{
	@Autowired
	SessionFactory sessionFactory;

	
	public void addItem(Item item) {
		System.out.println("ItemDaoImpl");
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.save(item);
		transaction.commit();
		System.out.println("Done saving the item");	
		
		
	}

	
	public List<Item> viewItem(){
		
		
			Session session= sessionFactory.getCurrentSession();
			Transaction transaction= session.beginTransaction();
			
			List<Item>list=session.createCriteria(Item.class).list();
			return list;
		
		
		}


	
	public void deleteItem(int id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Item item=session.get(Item.class, new Integer(id));
		session.delete(item);
		System.out.println("item deleted");
		transaction.commit();
		System.out.println("deleted the item"+item.getItemName());	
		
	}


	
	public Item getItemById(int id) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		Item item=session.load(Item.class, new Integer(id));
		return item;
		
		
	}


	
	public void updateItem(Item item) {
		Session session=sessionFactory.getCurrentSession();
		Transaction transaction=session.beginTransaction();
		session.update(item);
		transaction.commit();
		System.out.println("edit has done");
		
	}


	
		
		
	}
	




