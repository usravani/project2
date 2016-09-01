package com.projectxml.dao;

import java.util.List;

import com.projectxml.model.Item;

public interface ItemDao {
	void addItem(Item item);
	public List<Item> viewItem();
	public void deleteItem(int id);
	Item getItemById(int id);
	void updateItem(Item item);
	

}
