package com.hampcode.service;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.hampcode.model.entity.Category;

public interface CategoryService extends CrudService<Category, Long>{	
	public Page<Category> findAll(Pageable pageable) throws Exception;
	public Page<Category> fetchByName(String name,Pageable pageable) throws Exception;
}
