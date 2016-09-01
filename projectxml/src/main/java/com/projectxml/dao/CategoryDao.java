package com.projectxml.dao;

import java.util.List;

import com.projectxml.model.Item;

public interface CategoryDao {

	List<Item> addMens();
	List<Item> getItemByCategory( String category);

}
