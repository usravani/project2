package com.projectxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectxml.dao.CartItemDao;
import com.projectxml.model.CartItem;


@Service
public class CartItemServiceImpl implements CartItemService{
	@Autowired
	CartItemDao c;
  
	public void addItems(CartItem cartitem) {
		
			System.out.println("customer service");
			c.addItems(cartitem);
			
			
		}

	@Override
	public List<CartItem> ViewCartProducts(int cartId) {
		// TODO Auto-generated method stub
		return c.ViewCartProducts(cartId);
	}

	

	@Override
	public void deleteItem(CartItem cartitem) {
		 c.deleteItem(cartitem);
		
	}

	}

	
		
	


