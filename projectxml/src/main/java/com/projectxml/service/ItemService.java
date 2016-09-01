package com.projectxml.service;

import java.util.List;

import com.projectxml.model.Item;

public interface ItemService {
	void addItem(Item item);
	public List<Item> viewItem();
	public void deleteItem(int id);
	Item getItemById(int id);
	void updateItem(Item item);
	

}
