package com.projectxml.model;

import java.io.Serializable;

public class UserOrder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int orderId;
	private Customer customer;
	private Cart cart;
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public Cart getCart() {
		return cart;
	}
	public void setCart(Cart cart) {
		this.cart = cart;
	}
	

}
