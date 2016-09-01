package com.projectxml.service;

import java.util.List;

import com.projectxml.model.Item;

public interface CategoryService {

	List<Item> addMens();
	List<Item> getItemByCategory(String category);

}
