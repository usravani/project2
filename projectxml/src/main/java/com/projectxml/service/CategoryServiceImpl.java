package com.projectxml.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projectxml.dao.CategoryDao;
import com.projectxml.model.Item;
@Service
public class CategoryServiceImpl implements CategoryService{
	
@Autowired
CategoryDao categoryDao;
	public List<Item> getItemByCategory(String category) {
		
		return categoryDao.getItemByCategory(category);
	}
	
public List<Item> addMens() {
		
		return null;
	}
}
