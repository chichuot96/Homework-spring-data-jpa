package vn.topica.itlab4.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import vn.topica.itlab4.entity.Category;
import vn.topica.itlab4.repository.CategoryRepository;
import vn.topica.itlab4.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService
{
	@Autowired
	private CategoryRepository repository;
	
	@Override
	public Category save(Category cate) {
		return repository.save(cate);
	}

	@Override
	public List<Category> findByType(String type, int pageIndex, int pageSize) {
		return repository.findByType(type, PageRequest.of(pageIndex,pageSize));
		 
	}

}