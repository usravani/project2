package com.projectxml.service;

import java.util.List;

import com.projectxml.model.CartItem;
import com.projectxml.model.Customer;

public interface CartItemService {
public void addItems(CartItem cartitem);
List<CartItem>ViewCartProducts(int cartId);
public void deleteItem(CartItem cartitem);

}


